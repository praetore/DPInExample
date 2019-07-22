public class Main {

    public static void main(String[] args) {
        StarPrinter starPrinter = new StarPrinter();
        ERemoveFormatter eRemoveFormatter = new ERemoveFormatter();
        String out1 = starPrinter.printStars(eRemoveFormatter.format("Hello"));

        StripesPrinter stripesPrinter = new StripesPrinter();
        CapitalizeFormatter capitalizeFormatter = new CapitalizeFormatter();
        stripesPrinter.setString(capitalizeFormatter.execute("World"));
        String out2 = stripesPrinter.getStringWithStripes();

        System.out.println(out1);
        System.out.println(out2);
    }
}
