package uk.co.mruoc;

@SuppressWarnings("serial")
public class ScraperException extends RuntimeException {

    public ScraperException(Throwable cause) {
        super(cause);
    }

    public ScraperException(String message) {
        super(message);
    }

}
