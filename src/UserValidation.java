import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserValidation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Name");
        String firstName = scan.next();
        System.out.println("Enter Last Name");
        String lastName = scan.next();
        String regex = "^[A-Z][a-z]{3,}$";
        Pattern p = Pattern.compile(regex);
        boolean fName = firstName.matches(p.pattern());
        boolean lName = lastName.matches(p.pattern());
        System.out.println(fName);
        System.out.println(lName);

    }
}
