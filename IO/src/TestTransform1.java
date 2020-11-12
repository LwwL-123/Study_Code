import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class TestTransform1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\IO\\test\\char.txt"));
            osw.write("lzw123lzw123123123");// 把字符串写入到指定的文件中去
            System.out.println(osw.getEncoding());// 使用getEncoding()方法取得当前系统的默认字符编码
            osw.close();

            osw = new OutputStreamWriter(new FileOutputStream(
                    "C:\\Users\\Administrator\\IdeaProjects\\IO\\test\\char.txt", true), "ISO8859_1");
// 如果在调用FileOutputStream的构造方法时没有加入true，那么新加入的字符串就会替换掉原来写入的字符串，在调用构造方法时指定了字符的编码
            osw.write("MircosoftsunIBMOracleApplet");// 再次向指定的文件写入字符串，新写入的字符串加入到原来字符串的后面
            System.out.println(osw.getEncoding());
            osw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
