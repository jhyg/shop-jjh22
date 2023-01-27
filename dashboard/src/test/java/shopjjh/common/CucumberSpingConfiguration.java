package shopjjh.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import shopjjh.DashboardApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { DashboardApplication.class })
public class CucumberSpingConfiguration {}
