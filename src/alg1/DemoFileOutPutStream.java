package alg1;

import org.junit.Test;

import java.io.*;
import java.nio.charset.Charset;


public class DemoFileOutPutStream {

    @Test
    public void mytest() {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream("/home/xb/IdeaProjects/Algorithems/src/hello.txt");
            String data = "Linh, 国庆节快乐!";
            byte[] bytes = data.getBytes(Charset.forName("utf-8"));
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
