import com.mark.BabySitter;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BabySitterTest {
    @Test
    public void whenBabySitterIsPassedAOneHourShiftItReturnsTwelve() {
        BabySitter babySitter = new BabySitter();
        assertEquals("12", babySitter.baby(1));
    }
}
