package patterns.impl;

/**
 * Regex found here: https://www.oreilly.com/library/view/regular-expressions-cookbook/9781449327453/ch04s02.html
 */
public class NorthAmericanPhoneNumberPattern extends BasePattern {
    private static final String NA_PHONE_PATTERN = "^\\(?([0-9]{3})\\)?[-.●]?([0-9]{3})[-.●]?([0-9]{4})$\n";

    public NorthAmericanPhoneNumberPattern() {
        super(NA_PHONE_PATTERN);
    }
}
