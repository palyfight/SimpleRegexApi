package patterns;

public class PatternFactory {
    /**
     *
     * @param patternType the PatternType object you'd like to instantiate
     * @return RegexPattern instance
     */
    public RegexPattern getPattern(PatternType patternType) {
        if(patternType == null){
            throw new IllegalArgumentException("patternType is null");
        }
        if(patternType.equals(PatternType.IPV4)) {
            return new IPV4Pattern();

        } else if(patternType.equals(PatternType.IPV6)) {
            return new IPV6Pattern();

        } else if(patternType.equals(PatternType.EMAIL)) {
            return new EmailPattern();
        }

        return null;
    }
}
