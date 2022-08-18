import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyFormatter{
    //creating a locale for India using english as language
    Locale INDIA = new Locale("en", "IN");

    //formating to the countries locale
    NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
    NumberFormat india = NumberFormat.getCurrencyInstance(INDIA);
    NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
    NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

    public String currencyFormatter(double payment){
        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
        return "finished";
    }
}