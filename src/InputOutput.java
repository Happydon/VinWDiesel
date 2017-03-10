import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by admin on 10.03.2017.
 */
public class InputOutput {
    try(
    InputStream is = new FileInputStream())

    {
        while (true) {
            int c = is.read();
            if (c < 0)
                break;
            os.write(c);
        }
    }

    byte[] buf = new byte[1024];
    int n = is.read(buf);
     try(
    InputStream is = new BufferedInputStream(new FileInputStream()) ;
    outputStream os = new BufferedInputStream(new FileInputStream(""));
        while (true)

        {
            int n = is.read();
            if (n < 0)
                break;
            os.write(n);
        }

    }
