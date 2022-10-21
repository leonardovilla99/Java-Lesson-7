import java.util.Scanner;

public class PasswordReqChecker {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String password;
            System.out.println("Enter a password with at least, one letter, at most one digit, minimum 8 characters long");
            password = input.next();
            if(isValid(password)){
                System.out.println("Password met requirements");
            }else{
                System.out.println("Password do not met requirements");
            }
        }
    }

    public static boolean isValid(String password){
        if(password.length() >= 8 && atLeastOneLetter(password) && atMostOneDigit(password)){
            return true;
        }else{
            return false;
        }
    }

    public static boolean atLeastOneLetter(String password){
        char c;
        for(int i = 0; i < password.length(); i++){
            c = password.charAt(i);
            if(Character.isLetter(c)){
                return true;
            }
        }
        return false;
    }

    public static boolean atMostOneDigit(String password){
        char c;
        int count = 0;
        for(int i = 0; i < password.length(); i++){
            c = password.charAt(i);
            if(Character.isDigit(c)){
                count ++;
            }
        }
        if(count > 1){
            return false;
        }else{
            return true;
        }
    }
    
}
