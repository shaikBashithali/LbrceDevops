package bachi;

import java.util.Scanner;

public class Signin {

    public static void main(String[] args) {
        String correctUsername = "user";
        String correctPassword = "pass123";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Sign-in successful! Welcome.");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
        scanner.close();
    }
}
