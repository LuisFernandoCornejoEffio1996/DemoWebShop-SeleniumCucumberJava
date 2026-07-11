package com.luis.qa.demowebshop;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.luis.qa.demowebshop",
        tags = "",
        plugin = {
                "pretty"
        }
)
public class RunnerTest {
}
