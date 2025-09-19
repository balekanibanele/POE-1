/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poe.pkg1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
Login loginSystem = new Login();



// Get username
System.out.print("Enter username (must contain '_' and be ≤5 characters): ");
String username = scanner.nextLine();

// Get password
System.out.print("Enter password (must be ≥8 chars, with capital, number, special char): ");
String password = scanner.nextLine();

// Get cell phone number
System.out.print("Enter South African cell phone number (format: +27xxxxxxxxx): ");
String cellNumber = scanner.nextLine();

// Register user
String registrationResult = loginSystem.registerUser(username, password, cellNumber);
System.out.println(registrationResult);

// If registration was successful, proceed to login
if (registrationResult.equals("Password successfully captured.")) {
System.out.println("\n=== LOGIN ===");

System.out.print("Enter username: ");
String Username = scanner.nextLine();

System.out.print("Enter password: ");
String Password = scanner.nextLine();

// Login user
String loginResult = loginSystem.returnLoginStatus(Username, Password);
System.out.println(loginResult);
}

scanner.close();
    }
    
}
