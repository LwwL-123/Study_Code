package com.lee;

import com.lee.pojo.Dog;
import com.lee.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot02ConfigApplicationTests {

    @Autowired
    private Person person;
    @Autowired
    private Dog dog;

    @Test
    void AAA(){
        System.out.println(person);
    }

}
