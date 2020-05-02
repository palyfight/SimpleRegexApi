import Patterns.PatternType;
import Patterns.RegexPattern;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class IPV4PatternTest {

    @Test
    public void testIpv4() {
        String testData = "000.0000.00.00\n" +
                "192.168.1.1\n" +
                "912.456.123.123";

        List<String> expectedMatches = new ArrayList<>();
        expectedMatches.add("192.168.1.1");

        PatternFactory pf = new PatternFactory();

        RegexPattern rp = pf.getPattern(PatternType.IPV4);
        List<String> actualMatches = rp.match(testData);

        assertEquals(expectedMatches.size(), actualMatches.size());
        assertEquals(expectedMatches, actualMatches);
    }

}