import org.junit.jupiter.api.Test;
import patterns.PatternFactory;
import patterns.PatternType;
import patterns.RegexPattern;
import patterns.impl.EmailPattern;
import patterns.impl.IPV4Pattern;
import patterns.impl.IPV6Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatternFactoryTest {

    @Test
    public void testIpv4PatternInstance() {
        PatternFactory pf = new PatternFactory();
        RegexPattern rp = pf.getPattern(PatternType.IPV4);

        assertTrue(rp instanceof IPV4Pattern);
    }

    @Test
    public void testIpv6PatternInstance() {
        PatternFactory pf = new PatternFactory();
        RegexPattern rp = pf.getPattern(PatternType.IPV6);

        assertTrue(rp instanceof IPV6Pattern);
    }

    @Test
    public void testEmailPatternInstance() {
        PatternFactory pf = new PatternFactory();
        RegexPattern rp = pf.getPattern(PatternType.EMAIL);

        assertTrue(rp instanceof EmailPattern);
    }
}

