package pratibha.knoldus.springbootclone;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pratibha.knoldus.springbootclone.controller.web.AccountController;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringDemoApplicationTest {

    @Autowired
    private AccountController controller;

    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }
}