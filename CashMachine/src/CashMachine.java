import java.util.Locale;

public class CashMachine {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        ConsoleHelper.getValidTwoDigits(ConsoleHelper.askCurrencyCode());
    }
}
