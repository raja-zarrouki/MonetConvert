public class Main {
    public static void main(String[] args) {
        Dollars dollars = new Dollars();
        Euros euros = new Euros();

        double amountInDollars = 100;
        double amountInEuros = dollars.convertTo(amountInDollars, euros);
        System.out.println(amountInDollars + " USD = " + amountInEuros + " EUR");

        Dinars dinars = new Dinars();
        double amountInDinars = dollars.convertTo(amountInDollars, dinars);
        System.out.println(amountInDollars + " USD = " + amountInDinars + " DZD");
    }
}

