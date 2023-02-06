package Testrail;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface TestRailIssue {

    int issueID();
    int projectID() default 9;
    String testRunName();
    ArrayList<CustomStepResult> customResults = new ArrayList<>();

}
