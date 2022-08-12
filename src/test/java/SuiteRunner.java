import org.junit.runner.JUnitCore;
import steps.def.BaseTest;
import suite.SuiteExecution;

public class SuiteRunner {


    public static void main(String[] args) {

        BaseTest.setEnvironment(args[0]);

        try {
            JUnitCore.runClasses(SuiteExecution.class);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
