import Patterns.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PatterFactoryTest {

    @Test
    public void testNullPatternType() {
        PatternFactory pf = new PatternFactory();
        assertThrows( IllegalArgumentException.class, () -> pf.getPattern(null));
    }

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
