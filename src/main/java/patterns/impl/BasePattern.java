package patterns.impl;

import patterns.RegexPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BasePattern implements RegexPattern {
    private final String REGEX_PATTERN;

    BasePattern(String pattern) {
        this.REGEX_PATTERN = pattern;
    }

    @Override
    public List<String> match(String s) {
        Pattern pattern = Pattern.compile(REGEX_PATTERN);
        Matcher matcher = pattern.matcher(s);
        List<String> matches = new ArrayList<>();

        while(matcher.find()) {
            matches.add(matcher.group());
        }

        return matches;
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
