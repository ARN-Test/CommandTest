package Interface;
/**
 *
 * @author A.R. Nobel
 */
import java.io.*;
class Shutdown {
    static public int time=0;
    Shutdown(int x)throws IOException {
        time = x;
        Runtime r = Runtime.getRuntime();
        r.exec("shutdown -s -t "+time);
        //System.exit(0);
    }
}
