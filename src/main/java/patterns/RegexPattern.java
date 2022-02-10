package patterns;

import java.util.List;

public interface RegexPattern {
    /**
     * @param s the String object from which to find matches
     * @return a List<String> object with all the matches found
     */
    List<String> match(String s);

    /**
     * @param s the String object from which to find matches
     * @return true if at least one match is found
     */
    boolean matchFound(String s);

    /**
     *
     * @param s the String object from which to find matches
     * @return the number of matches found in the input String
     */
    int countMatches(String s);
}
