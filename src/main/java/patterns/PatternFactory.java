package patterns;

import org.apache.commons.lang3.StringUtils;
import patterns.impl.*;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternFactory {
    /**
     *
     * @param patternType the PatternType object you'd like to instantiate
     * @return RegexPattern instance
     */
    public RegexPattern getPattern(PatternType patternType) {
        if(patternType == null){
            throw new UnsupportedPatternException("patternType is null");
        }

        if(patternType.equals(PatternType.IPV4)) {
            return new IPV4Pattern();
        } else if(patternType.equals(PatternType.IPV6)) {
            return new IPV6Pattern();
        } else if(patternType.equals(PatternType.EMAIL)) {
            return new EmailPattern();
        }

        throw new UnsupportedPatternException(String.format("Received unsupported patternType: %s", patternType));
    }

    /**
     *
     * @param customPattern
     * @return RegexPattern instance
     */
    public RegexPattern getPattern(String customPattern) {
        String errorMsg = String.format("Invalid pattern. Pattern provided was %s", customPattern);

        if(StringUtils.isEmpty(customPattern))
            throw new UnsupportedPatternException(errorMsg);

        try {
            Pattern.compile(customPattern);
        } catch (PatternSyntaxException e) {
            throw new UnsupportedPatternException(errorMsg, e);
        }

        return new CustomPattern(customPattern);
    }
}
