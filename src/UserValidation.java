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
        System.out.println("Enter Email Id");
        String emailId = scan.next();
        String regex1 = "^abc(.+)[a-z]*@bl(.)co(.)+[a-z]$";
        System.out.println("Enter Mobile Number");
        String mobileNo = scan.next();
        String regex2 = "^[0-9]{2}+[6-9][0-9]{9}";
        System.out.println("Enter Your Password");
        String pass = scan.next();
        String regex3 = "^[A-Z][a-z]{7,}";
        boolean fName = firstName.matches(regex);
        boolean lName = lastName.matches(regex);
        boolean email = emailId.matches(regex1);
        boolean mobile = mobileNo.matches(regex2);
        boolean password = pass.matches(regex3);
        System.out.println(fName);
        System.out.println(lName);
        System.out.println(email);
        System.out.println(mobile);
        System.out.println(password);
    }
}
