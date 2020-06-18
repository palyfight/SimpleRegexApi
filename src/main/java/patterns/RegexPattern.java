package patterns;

import java.util.List;

public interface RegexPattern {
    /**
     *
     * @param s the String object from which to find matches
     * @return a List<String> object with all the matches found
     */
    List<String> match(String s);
}
