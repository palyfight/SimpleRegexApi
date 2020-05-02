import Patterns.PatternType;
import Patterns.RegexPattern;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailPatternTest {

    @Test
    public void testEmail() {
        String testData = "foo foo@bar.foo foo@ foo@bar foo foo.bar";

        List<String> expectedMatches = new ArrayList<>();
        expectedMatches.add("foo@bar.foo");

        PatternFactory pf = new PatternFactory();
        RegexPattern rp = pf.getPattern(PatternType.EMAIL);
        List<String> actualMatches = rp.match(testData);

        assertEquals(expectedMatches.size(), actualMatches.size());
        assertEquals(expectedMatches, actualMatches);
    }
}
