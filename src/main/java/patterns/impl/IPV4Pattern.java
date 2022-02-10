package patterns.impl;

/**
 * Regex found here: https://www.oreilly.com/library/view/regular-expressions-cookbook/9780596802837/ch07s16.html
 */
public class IPV4Pattern extends BasePattern {
    private static final String IPV4_PATTERN = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    public IPV4Pattern() {
        super(IPV4_PATTERN);
    }

}
