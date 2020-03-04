import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static passwordIsOk password = new passwordIsOk();

    public static void main(String[] args){

        System.out.println("Please enter desired password");
        /*while ((in.next().length() < 0))
        {
            System.out.println("Enter a password, please.");
            in.next();
        }*/
        String passwords = in.nextLine();

        System.out.println(password.passwordIsOk(passwords));
    }
}
