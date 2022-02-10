import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoPracticeTest {
    @Test
    public void return13(){
        assertEquals(13, SkillDemoPractice.return13()); // will fail
    }
}
// javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar SkillDemoPractice.java SkillDemoPracticeTest.java
// java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore SkillDemoPracticeTest