

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

/**
 * Helper method for testing main method outputs.
 * Source: http://gilmation.com/articles/junit-with-standard-and-error-output-in-main-methods/
 *
 */
public abstract class AbstractMainTests {
    private static final PrintStream OUT = System.out;
    private static final PrintStream ERR = System.err;

    private static void recoverOriginalOutput() {
        System.err.flush();
        System.out.flush();
        System.setOut(AbstractMainTests.OUT);
        System.setErr(AbstractMainTests.ERR);
    }
    public static String[] executeMain(String className, String[] args) {
        // First, change the standard and error output streams
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        PrintStream tempOutput = new PrintStream(bos, true);
        System.setOut(tempOutput); 
        System.setErr(tempOutput);

        List<String> result = new ArrayList<String>();
        try {
            AbstractMainTests.invokeMain(className, args); // Call main!!
            // Collect main() execution output
            BufferedReader reader = 
                new BufferedReader(new StringReader(bos.toString()));
            String line = reader.readLine();
            while (line != null) {
                result.add(line);
                line = reader.readLine();
            }
        } catch(Throwable e) {
            throw new RuntimeException(
                "Error obtaining output for ["+className+"]", e
            );
        } finally {
            recoverOriginalOutput();  // Return output to its original form
            try {
                bos.close();
                tempOutput.close();  // Close streams
            } catch (IOException e) { }
        }
        return result.toArray(new String[0]); // Convert from list to an array
    }
    public static void invokeMain(String test, String[] args) {
       try {
           Class<?> clazz = Class.forName(test);
           Object app = clazz.newInstance();
           Method m = app.getClass().
               getMethod("main", (new String[0]).getClass());

           // Make sure it is the static void main(String[]) method
           if ((m.getReturnType() != Void.TYPE) || 
               (!Modifier.isStatic(m.getModifiers()))) {
                   throw new RuntimeException(
                       "Not executable found: static main(String[])"
                   );
           } 
           Object[] param = { args };
           m.invoke(app, param);
       } catch(Throwable e) {
          throw new RuntimeException("Error executing main", e);
       }  
    }
}