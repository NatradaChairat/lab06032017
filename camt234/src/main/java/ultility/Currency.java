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
        }
        return exchangeCurrency;

    }
}
