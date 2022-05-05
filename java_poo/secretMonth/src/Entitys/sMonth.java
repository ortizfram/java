package Entitys;

public class sMonth {
    final String[] month = {"january", "february", "march", "april", "may", "august", "september", "october", "november", "december"};
    final String secretMonth = month[(int) (Math.random() * 12)];

    public String[] getMonth() {
        return month;
    }
    public String getSecretMonth() {
        return secretMonth;
    }


}
