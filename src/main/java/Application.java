import Patterns.PatternType;
import Patterns.RegexPattern;

public class Application {
    public static void main(String[] args) {
        String test = "foo192.168.0.1 bar0.0.0.1";

        PatternFactory pf = new PatternFactory();

        RegexPattern rp = pf.getPattern(PatternType.IPV4);

        System.out.println(rp.getClass().getCanonicalName());

        System.out.println(rp.match(test));

    }
}
