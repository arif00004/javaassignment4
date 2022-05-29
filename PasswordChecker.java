import java.util.Scanner;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a password: ");
        String password = in.nextLine();
        System.out.println("Password is " + (isValid(password.toCharArray()) ? "valid: " : "invalid: ") + password);
    }

    public static boolean isValid(char[] password) {
        if (password.length < 10) {
            return false;
        }
        int digit = 0;
        for (int i = 0; i < password.length; i++) {
            if (password[i] > '0' && password[i] < '9') {
                digit++;
            }
            if (((password[i] > 'a' && password[i] < 'z') ||
                    (password[i] > 'A' && password[i] < 'Z') ||
                    (password[i] > '0' && password[i] < '9'))) {
                return true;
            }
        }
        return digit >= 2;
    }
}