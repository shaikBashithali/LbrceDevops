package bachi;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "admin123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
        scanner.close();
    }
}
