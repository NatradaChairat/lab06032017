package main.java.ultility;

/**
 * Created by CAMT on 3/13/2017.
 */
public class Currency {

    public double exchange(String sourceCurrency,double amount,String targetCurrency){


        double exchangeCurrency = 0.0;
        if (!sourceCurrrency.equalsIgnoreCase("USD") && (!targetCurrency.equalsIgnoreCase("USD"))) {
            if (sourceCurrrency.equalsIgnoreCase("THB")) {
                exchangeCurrency = (amount / 33) * 1.01;
            } else exchangeCurrency = (amount / 1.01) * 33;
        }else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("THB")) {
            exchangeCurrency = amount * 33;

            // target currency is EUR
        } else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("EUR"))
            exchangeCurrency = amount * 1.01;

            // source currency is THB
        else if (sourceCurrrency.equalsIgnoreCase("THB") && (targetCurrency.equalsIgnoreCase("USD")))
            exchangeCurrency = amount / 33;

            // target currency is THB
        else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("THB")) {
            exchangeCurrency = amount * 33;

            // target currency is EUR
        } else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("EUR"))
            exchangeCurrency = amount * 1.01;

            // source currency is THB

        else if (sourceCurrrency.equalsIgnoreCase("THB") && (targetCurrency.equalsIgnoreCase("USD")))
            exchangeCurrency = amount / 33;

            // target currency is THB
        else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("THB")) {
            exchangeCurrency = amount * 33;

        } else if (sourceCurrrency.equalsIgnoreCase("USD") && targetCurrency.equalsIgnoreCase("EUR"))
            exchangeCurrency = amount * 1.01;

            // source currency is THB

        else if (sourceCurrrency.equalsIgnoreCase("THB") && (targetCurrency.equalsIgnoreCase("USD"))) {
            exchangeCurrency = amount / 33;

            // source currency is EUR
        } else if (sourceCurrrency.equalsIgnoreCase("EUR") && (targetCurrency.equalsIgnoreCase("USD")))
            exchangeCurrency = amount / 1.01;
        else exchangeCurrency=Double.NaN;
        return exchangeCurrency;

    }
}
