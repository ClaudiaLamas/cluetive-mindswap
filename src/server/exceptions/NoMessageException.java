package server.exceptions;

public class NoMessageException extends Exception{

    public NoMessageException(String emptyMessage){
        super("Empty message");
    }
}
