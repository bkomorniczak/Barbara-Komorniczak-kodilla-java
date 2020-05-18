import com.kodilla.patterns.singleton.Logger;
import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {
    @Test
    public  void testGetLatLog(){
        //Given
        Logger.getInstance().log("Log");
        //When
        Logger.getInstance().getLastLog();
        //Then
        Assert.assertEquals("Log", Logger.getInstance().getLastLog());
    }

}
