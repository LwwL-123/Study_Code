import com.kuang.pojo.Student;
import com.kuang.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Student{
// name='李治玮',
// address=Address{address='null'},
// books=[《数据结构》, 《数据库》, 《计算机网络》, 《操作系统》],
// hobbys=[听歌, 旅游, 看电影],
// card={身份证=111222, 银行卡=123123123},
// games=[LOL, COC, BOB], wife='null',
// info={学号=160200a14, 性别=男, 姓名=李治玮}}
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user.toString());
    }

    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user.toString());
        System.out.println(user==user2);
    }

}
