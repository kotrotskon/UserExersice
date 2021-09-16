public class UserService {

    boolean changePassword(String username, String password){
        UserDb db = new UserDb();

        if(password.length()<8)
            return false;

        if(db.changePassword(username, password))
            return true;

        return false;
    }
}
