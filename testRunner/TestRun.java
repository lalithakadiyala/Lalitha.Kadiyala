package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {".//features/home_gain.feature"},
       // features={".//features/Reformated.feature"},
        // tags="@sanity",
       // features="@target/rerun.txt",
       // features= {".//features/Assigned_To_Me.feature"},
        //features={".//features"},

        //features={".//features/Assigned_To_Me.feature"},
        glue = "stepDefinitions",
        dryRun=false,
        plugin= {"pretty",
        "html:reports/myreport.html",
       "rerun:target/rerun.txt", //To capture failures
}
)
public class TestRun {

}
