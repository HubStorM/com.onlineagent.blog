import org.markdownj.MarkdownProcessor;

import java.io.*;

/**
 * @author lijie
 * @date 2017/10/19 18:57
 * @description
 */
public class Main {
    public static void main(String... args) throws Exception {
        MarkdownProcessor markdownProcessor = new MarkdownProcessor();
        InputStream in = new FileInputStream(new File("C:\\app\\workspace\\idea\\com.onlineagent.blog\\src\\main\\resources\\example.md"));
        int contentLen = in.available();
        byte[] st = new byte[contentLen];
        in.read(st);
        String html = markdownProcessor.markdown(new String(st));
        OutputStream out = new FileOutputStream(new File("C:\\app\\workspace\\idea\\com.onlineagent.blog\\src\\main\\resources\\example.html"));
        out.write(html.getBytes());
        in.close();
        out.close();
    }
}
