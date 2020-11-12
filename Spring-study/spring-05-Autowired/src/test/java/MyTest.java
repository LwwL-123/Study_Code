import com.kuang.pojo.Peaple;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
        @Test
        public void test1(){
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            Peaple people = context.getBean("people", Peaple.class);
            people.getCat().shout();
            people.getDog().shout();
        }

}
