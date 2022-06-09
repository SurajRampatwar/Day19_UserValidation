import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidation {
    public static void main(String[] args) {
        System.out.println("Enter First name");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        String regex = "^[A-Z][a-z]{3,}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        boolean result = name.matches(p.pattern());
        System.out.println(result);

    }
}
