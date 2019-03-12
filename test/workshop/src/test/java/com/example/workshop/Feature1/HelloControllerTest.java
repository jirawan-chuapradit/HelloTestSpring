package com.example.workshop.Feature1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class HelloControllerTest {

    // new instance of java
    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void sayHello(){
        HelloResponse response = testRestTemplate.getForObject(
                "/hello/test", HelloResponse.class);


        assertEquals("Hello test", response.getMessage());

    }

}