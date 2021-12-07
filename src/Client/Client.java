package Client;

public class Client {
    
    public Client(){
        
    }

    public boolean authenticateUser(String username, String password){
        return true;
    }

    public boolean createNewUser(String username, String password, String email) {
        return true;
    }

    public boolean logOutUser() {
        return true;
    }

    public boolean resetPassword(String password, String confirmPassword) {
        return true;
    }
}
