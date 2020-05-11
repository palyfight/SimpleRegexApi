import Patterns.PatternFactory;
import Patterns.PatternType;
import Patterns.RegexPattern;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IPV6PatternTest {

    @Test
    public void testIpv6() {
        String testData = "1200:0000:AB00:1234:0000:2552:7777:1313\n" +
                "21DA:D3:0:2F3B:2AA:FF:FE28:9C5A\n" +
                "1200:0000:AB00:1234:O000:2552:7777:1313    // invalid characters present\n" +
                "FE80:0000:0000:0000:0202:B3FF:FE1E:8329  \n" +
                "[2001:db8:0:1]:80                          // valid but, no support for port numbers";

        List<String> expectedMatches = new ArrayList<>();
        expectedMatches.add("1200:0000:AB00:1234:0000:2552:7777:1313");
        expectedMatches.add("21DA:D3:0:2F3B:2AA:FF:FE28:9C5A");
        expectedMatches.add("FE80:0000:0000:0000:0202:B3FF:FE1E:8329");

        PatternFactory pf = new PatternFactory();

        RegexPattern rp = pf.getPattern(PatternType.IPV6);
        List<String> actualMatches = rp.match(testData);

        assertEquals(expectedMatches.size(), actualMatches.size());
        assertEquals(expectedMatches, actualMatches);
    }
}
