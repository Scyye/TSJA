package dev.scyye.thunderstoreapi.exceptions;

public class NoSuchPackageException extends Exception{
    public NoSuchPackageException() {
        super();
    }

    public NoSuchPackageException(String message) {
        super(message);
    }

    public NoSuchPackageException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchPackageException(Throwable cause) {
        super(cause);
    }

    protected NoSuchPackageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
