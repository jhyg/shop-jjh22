package shopjjh.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shopjjh.CustomerApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { CustomerApplication.class })
public class CucumberSpingConfiguration {}
