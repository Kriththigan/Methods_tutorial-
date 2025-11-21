public class Email {
    private static void check_email(String email) {
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Email is correct.");
        } else {
            System.out.println("Email is incorrect.");
        }
    }
    public static void main(String[] args) {
        String email = "bla bla bla";
        check_email(email);

        email = "bla@bla";
        check_email(email);

        email = "bla@bla.com";
        check_email(email);
    }
}
