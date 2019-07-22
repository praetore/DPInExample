public class ERemoveFormatter {

    public String format(String string) {
        return string.replaceAll("[e]*", "");
    }
}
