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

    @Override
    public List<String> match(String s) {
        PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
        Iterable<PhoneNumberMatch> phoneNumbersIter = phoneUtil.findNumbers(s, "CA");
        List<String> results = StreamSupport.stream(phoneNumbersIter.spliterator(), false).map(phone -> phone.rawString()).collect(Collectors.toList());

        return results;
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
