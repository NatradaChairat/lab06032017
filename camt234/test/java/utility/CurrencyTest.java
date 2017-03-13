package utility;

/**
 * Created by CAMT on 3/13/2017.
 */

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class CurrencyTest {
    @Test
    public void testExchange() {
        //the double equal is check for the third digit precision (the second
        // paramether)).you may fix the second parameter
        //the first parameter of the closeTo is the value which will be check
        // the return value of the exchange method

        assertThat(currency.exchange("USD", 1.0, "USD"), closeTo(1.0, 0.001));
    }

}
