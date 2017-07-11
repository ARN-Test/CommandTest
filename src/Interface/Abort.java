package Interface;
/**
 *
 * @author A.R. Nobel
 */
import java.io.*;
public class Abort {
    Abort()throws IOException {
        Runtime r = Runtime.getRuntime();
        r.exec("shutdown -a");
        //System.exit(0);
    }
}
