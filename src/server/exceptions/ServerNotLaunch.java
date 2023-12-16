package server.exceptions;

import java.rmi.ServerException;

public class ServerNotLaunch extends ServerException {

    public ServerNotLaunch() {
        super("Server could not launch due to IOException");
    }
}
