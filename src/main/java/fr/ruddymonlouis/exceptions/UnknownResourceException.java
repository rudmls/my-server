package fr.ruddymonlouis.exceptions;

public class UnknownResourceException extends RuntimeException {

    private static final  String MESSAGE="Resouce inconnu";

    public UnknownResourceException() {
        super(MESSAGE);
    }
    public UnknownResourceException(Throwable t) {
        super(MESSAGE,t);
    }
}
