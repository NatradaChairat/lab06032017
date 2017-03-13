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
        Currency currency = new Currency();
        //the double equal is check for the third digit precision (the second
        // paramether)).you may fix the second parameter
        //the first parameter of the closeTo is the value which will be check
        // the return value of the exchange method

        assertThat(currency.exchange("USD", 1.0, "USD"), closeTo(1.0, 0.001));
        assertThat(currency.exchange("USD", 10.0, "THB"), closeTo(330.0, 0.001));
        assertThat(currency.exchange("USD", 10.0, "EUR"), closeTo(10.1, 0.001));
        assertThat(currency.exchange("EUR", 10.1, "USD"), closeTo(10.0, 0.001));

    }

}
