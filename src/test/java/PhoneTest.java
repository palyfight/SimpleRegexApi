import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import patterns.RegexPattern;
import patterns.PatternFactory;
import patterns.PatternType;

public class PhoneTest {

    @Test
    public void testEmail() {
        String testData = "foo 438 baz 8195555555";

        List<String> expectedMatches = new ArrayList<>();
        expectedMatches.add("8195555555");

        PatternFactory pf = new PatternFactory();
        RegexPattern rp = pf.getPattern(PatternType.PHONE);
        List<String> actualMatches = rp.match(testData);

        assertEquals(expectedMatches.size(), actualMatches.size());
        assertEquals(expectedMatches, actualMatches);
    }
    
}
