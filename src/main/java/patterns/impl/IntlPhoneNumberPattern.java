package patterns.impl;

/**
 * Regex found here: https://www.oreilly.com/library/view/regular-expressions-cookbook/9781449327453/ch04s03.html
 */
public class IntlPhoneNumberPattern extends BasePattern {
    private static final String INTL_PHONE_PATTERN = "^\\+(?:[0-9]●?){6,14}[0-9]$";

    public IntlPhoneNumberPattern() {
        super(INTL_PHONE_PATTERN);
    }
}
