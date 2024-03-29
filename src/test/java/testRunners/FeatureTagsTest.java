package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./src/test/resources/featureFiles/feature1.feature",
		"./src/test/resources/featureFiles/feature2.feature",
		"./src/test/resources/featureFiles/feature3.feature"},
				tags = "(@regression or @smoke) and  not @functional")
public class FeatureTagsTest {

}
