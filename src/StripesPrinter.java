public class StripesPrinter {

    private String in;

    public void setString(String in) {
        this.in = in;
    }

    public String getStringWithStripes() {
        return "---".concat(in).concat("---");
    }
}
