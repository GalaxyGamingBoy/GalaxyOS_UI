package sample;

public class LoginChecker {
    public static boolean UsernameCheck(String userInput, String username){
        if(userInput.equals(username)){
            //Correct
            return true;
        }else{
            //Gives Error
            return false;
        }
    }
    public static boolean PasswordCheck(String userInput,String password){
        if(userInput.equals(password)){
            //Correct
            return true;
        }else{
            //Gives Error
            return false;
        }
    }
}
