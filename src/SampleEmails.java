public class SampleEmails {
    public static void main(String[] args) {
        String[] emails = {"abc@yahoo.com", "abc-100@yahoo.com",
                "abc.100@yahoo.com", "abc111@abc.com",
                "abc-100@abc.net", "abc.100@abc.com.au",
                "abc@1.com", "abc@gmail.com.com",
                "abc+100@gmail.com"};
        String regex = "^[a-z0-9]+[.+-]{0,1}[0-9]{0,}@[0-9a-z]+(.)[a-z]{0,3}(.)[a-z]{2,3}$";
        for (int i = 0; i < emails.length; i++) {
            boolean valid = emails[i].matches(regex);
            if (valid) {
                System.out.println(i + " " + emails[i] + " valid ");
            } else {
                System.out.println(i + " " + emails[i] + " Invalid");
            }
        }
    }
}

