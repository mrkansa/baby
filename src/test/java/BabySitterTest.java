import com.mark.BabySitter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BabySitterTest {

    BabySitter babySitter;

    @Before
    public void setUp() {
        babySitter = new BabySitter();
    }

    @Test
    public void whenBabySitterIsPassedAOneHourShiftItReturnsTwelve() {
        assertEquals("12", babySitter.baby(1));
    }

    @Test
    public void whenBabySitterIsPassedATwoHourShiftItReturnsTwentyFour() {
        assertEquals("24", babySitter.baby(2));
    }

    @Test
    public void whenBabySitterIsPassedAThreeHourShiftItReturnsThirtySix() {
        assertEquals("36", babySitter.baby(3));
    }

    @Test
    public void whenBabySitterIsPassedAFourHourShiftItReturnsFortyEight() {
        assertEquals("48", babySitter.baby(4));
    }

    @Test
    public void whenBabySitterIsPassedASleepingBabyAtHourFiveItReturnsFortyEightPlusEight() {
        assertEquals("56", babySitter.baby(5));
    }

    @Test
    public void whenBabySitterIsPassedASleepingBabyAtHourSixItReturnsFiftySixPlusEight() {
        assertEquals("64", babySitter.baby(6));
    }

    @Test
    public void whenBabySitterIsPassedASleepingBabyAtHourSevenItReturnsSixtyFourPlusEight() {
        assertEquals("72", babySitter.baby(7));
    }

    @Test
    public void whenBabySitterIsPassedASleepingBabyAtHourEightItReturnsSeventyTwoPlusSixteen() {
        assertEquals("88", babySitter.baby(8));
    }

    @Test
    public void whenBabySitterIsPassedASleepingBabyAtHourNineItReturnsEightyEightPlusSixteen() {
        assertEquals("104", babySitter.baby(9));
    }

    @Test
    public void whenBabySitterIsPassedASleepingBabyAtHourTenItReturnsOneHundredFourPlusSixteen() {
        assertEquals("120", babySitter.baby(10));
    }

    @Test
    public void whenBabySitterIsPassedASleepingBabyAtHourElevenItReturnsOneHundredTwentyPlusSixteen() {
        assertEquals("136", babySitter.baby(11));
    }

}
