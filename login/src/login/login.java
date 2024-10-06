package login;

import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String correctUserName = "maxy";
        int correctPassword = 12746;
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String userName = scanner.nextLine();
            System.out.print("Enter password: ");
            int password = scanner.nextInt();
            scanner.nextLine();  // To consume the newline character

            if (userName.equals(correctUserName) && password == correctPassword) {
                System.out.println("Login successful!");
                break;  // Exit the loop if login is successful
            } else {
                attempts--;
                System.out.println("Login unsuccessful. You have " + attempts + " attempts left.");
            }

            if (attempts == 0) {
                System.out.println("You have been locked out.");
            }
        }

        scanner.close();
    }
}
