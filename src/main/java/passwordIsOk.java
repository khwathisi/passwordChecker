import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class passwordIsOk {
    public static Main main = new Main();

    public String passwordIsOk(String passwords){

        Pattern letter = Pattern.compile("[a-zA-Z]");
        Pattern upperLetter = Pattern.compile("[A-Z]");
        Pattern lowerLetter = Pattern.compile("[a-z]");
        Pattern digit = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");

        Matcher hasLetter = letter.matcher(passwords);
        Matcher hasUpperLetter = upperLetter.matcher(passwords);
        Matcher hasLowerLetter = lowerLetter.matcher(passwords);
        Matcher hasDigit = digit.matcher(passwords);
        Matcher hasSpecial = special.matcher(passwords);


        if(hasLetter.find() && hasUpperLetter.find() && hasLowerLetter.find() && hasDigit.find() && hasSpecial.find() && passwords.length() > 8)
        {
            System.out.println("Valid password");
        }else{
            if(!hasLetter.find())
            {
                System.out.println("password should exist");
            }
            if(!hasUpperLetter.find())
            {
                System.out.println("password should have at least one uppercase letter");
            }
            if(!hasLowerLetter.find())
            {
                System.out.println("password should have at least one lowercase letter");
            }
            if(!hasDigit.find())
            {
                System.out.println("password should at least have one digit");
            }
            if(!hasSpecial.find())
            {
                System.out.println("password should have at least one special character");
            }
            if(passwords.length() > 8)
            {
                System.out.println("password should be longer than than 8 characters");
            }
            System.out.println("");
            System.out.println("Please try again...");
            System.out.println("");
            main.main(null);
        }

        System.out.println("");
        return "";
    }
}
