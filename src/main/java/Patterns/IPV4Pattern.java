package Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regex found here: https://www.oreilly.com/library/view/regular-expressions-cookbook/9780596802837/ch07s16.html
 */
public class IPV4Pattern implements RegexPattern {
    private static final String IPV4_PATTERN = "(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

    @Override
    public List<String> match(String s) {
        Pattern pattern = Pattern.compile(IPV4_PATTERN);
        Matcher matcher = pattern.matcher(s);
        List<String> matches = new ArrayList<>();

        while(matcher.find()) {
            matches.add(matcher.group());
        }

        return matches;
    }
}
