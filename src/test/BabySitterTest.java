import com.mark.BabySitter;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BabySitterTest {
    @Test
    public void whenBabySitterIsPassedAOneHourShiftItReturnsTwelve() {
        BabySitter babySitter = new BabySitter();
        assertEquals("12", babySitter.baby(1));
    }

    @Test
    public void whenBabySitterIsPassedATwoHourShiftItReturnsTwentyFour() {
        BabySitter babySitter = new BabySitter();
        assertEquals("24", babySitter.baby(2));
    }

    @Test
    public void whenBabySitterIsPassedAThreeHourShiftItReturnsThirtySix() {
        BabySitter babySitter = new BabySitter();
        assertEquals("36", babySitter.baby(3));
    }

    @Test
    public void whenBabySitterIsPassedAFourHourShiftItReturnsFortyEight() {
        BabySitter babySitter = new BabySitter();
        assertEquals("48", babySitter.baby(4));
    }

}
