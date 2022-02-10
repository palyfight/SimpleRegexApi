package patterns;

public class UnsupportedPatternException extends RuntimeException {
    public UnsupportedPatternException(String errorMessage) {
        super(errorMessage);
    }

    public UnsupportedPatternException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
