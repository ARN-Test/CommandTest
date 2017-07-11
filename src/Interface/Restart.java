package Interface;
/**
 *
 * @author A.R. Nobel
 */
import java.io.*;
class Restart {
    static public int time=0;
    Restart(int x)throws IOException{
        time = x;
        Runtime r = Runtime.getRuntime();
        r.exec("shutdown -r -t "+time);
        //System.exit(0);
    }
}
