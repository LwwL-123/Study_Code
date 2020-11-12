import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("C:\\Users\\Administrator\\IdeaProjects\\IO\\src\\TestFileInputStream.java");
            out = new FileOutputStream("C:\\Users\\Administrator\\IdeaProjects\\IO\\test\\newTestFileInputStream.java");

            while((b=in.read())!=-1){
                out.write(b);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件读取失败");
            System.exit(-1);// 非正常退出
        } catch (IOException e) {
            System.out.println("文件复制失败！");
            System.exit(-1);
        }
        System.out.println("Student.StudentNew.java里面");

    }
}
