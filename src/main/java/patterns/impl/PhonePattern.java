package patterns.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.google.i18n.phonenumbers.PhoneNumberMatch;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import patterns.RegexPattern;

/**
 * Relies on Google's libphonenumber library
 * https://github.com/google/libphonenumber
 */
public class PhonePattern implements RegexPattern {

    public PhonePattern() {}

    public List<String> match(String s, String region) {
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        Iterable<PhoneNumberMatch> phoneNumbersIter = phoneUtil.findNumbers(s, region);

        return StreamSupport.stream(phoneNumbersIter.spliterator(), false).map(PhoneNumberMatch::rawString).collect(Collectors.toList());
    }

    /**
     * finds matches only for canadian number. Use match(String s, String region) to specify which region to use
     * @param s the String object from which to find matches
     * @return a List<String> of all matches found
     */
    @Override
    public List<String> match(String s) {
        return match(s, "CA");
    }

    @Override
    public boolean matchFound(String s) {
        return match(s).size() > 0;
    }

    @Override
    public int countMatches(String s) {
        return match(s).size();
    }
    
}
