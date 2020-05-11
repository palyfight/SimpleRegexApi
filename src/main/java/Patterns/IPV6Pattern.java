package Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Does not work in the following case:
 *
 * One or more consecutive groups containing zeros only may be replaced with a single empty group,
 * using two consecutive colons (::).[1] The substitution may only be applied once in the address,
 * since multiple occurrences would create an ambiguous representation.
 *
 * E.g: <2001:db8:85a3:0:0:8a2e:370:7334> will be found
 * but <2001:db8:85a3::8a2e:370:7334> will not
 *
 * Does not support ipv6 addresses with a port number
 */
public class IPV6Pattern implements RegexPattern {
    private static final String IPV6_PATTERN = "(([0-9a-fA-F]{1,4}:){7,7}[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,7}:|([0-9a-fA-F]{1,4}:){1,6}:[0-9a-fA-F]{1,4}|([0-9a-fA-F]{1,4}:){1,5}(:[0-9a-fA-F]{1,4}){1,2}|([0-9a-fA-F]{1,4}:){1,4}(:[0-9a-fA-F]{1,4}){1,3}|([0-9a-fA-F]{1,4}:){1,3}(:[0-9a-fA-F]{1,4}){1,4}|([0-9a-fA-F]{1,4}:){1,2}(:[0-9a-fA-F]{1,4}){1,5}|[0-9a-fA-F]{1,4}:((:[0-9a-fA-F]{1,4}){1,6})|:((:[0-9a-fA-F]{1,4}){1,7}|:)|fe80:(:[0-9a-fA-F]{0,4}){0,4}%[0-9a-zA-Z]{1,}|::(ffff(:0{1,4}){0,1}:){0,1}((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])|([0-9a-fA-F]{1,4}:){1,4}:((25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9])\\.){3,3}(25[0-5]|(2[0-4]|1{0,1}[0-9]){0,1}[0-9]))";

    @Override
    public List<String> match(String s) {
        Pattern pattern = Pattern.compile(IPV6_PATTERN);
        Matcher matcher = pattern.matcher(s);
        List<String> matches = new ArrayList<>();

        while(matcher.find()) {
            matches.add(matcher.group());
        }

        return matches;
    }
}