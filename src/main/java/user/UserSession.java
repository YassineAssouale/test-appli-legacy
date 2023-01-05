package user;

import exception.CollaboratorCallException;

public class UserSession {
    private static final UserSession usersession = new UserSession();

    private UserSession(){}

    public static UserSession getInstance(){
        return usersession;
    }

    public User getLoggedUser() throws CollaboratorCallException {
        throw new CollaboratorCallException("UserSession.getLoggedUser() should not ");
    }
}
