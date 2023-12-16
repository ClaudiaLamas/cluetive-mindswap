package server.exceptions;

public class NoMessageException extends Exception{

    public NoMessageException(){
        super("Empty message");
    }
}
