/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poe.pkg1;

/**
 *
 * @author RC_Student_lab
 */
class Login {
       private String username;
       private String password;
       private String cellNumber;

  public Login() {
// Default constructor
}

// Check username format
public boolean checkUserName(String username) {
return username.contains("_") && username.length() <= 5;
}

// Check password complexity
public boolean checkPasswordComplexity(String password) {
if (password.length() < 8) return false;

boolean hasCapital = false;
boolean hasNumber = false;
boolean hasSpecial = false;

for (char c : password.toCharArray()) {
if (Character.isUpperCase(c)) hasCapital = true;
if (Character.isDigit(c)) hasNumber = true;
if (!Character.isLetterOrDigit(c)) hasSpecial = true;
}

return hasCapital && hasNumber && hasSpecial;
}

// Check cell phone number format
public boolean checkCellPhoneNumber(String cellNumber) {
// South African numbers should start with +27 followed by 9 digits
return cellNumber.matches("^\\+27\\d{9}$");
}

// Register user
public String registerUser(String username, String password, String cellNumber) {
if (!checkUserName(username)) {
return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than five characters in length.";
}

if (!checkPasswordComplexity(password)) {
return "Password is not correctly formatted, please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.";
}

if (!checkCellPhoneNumber(cellNumber)) {
return "Cell number is incorrectly formatted or does not contain an international code, please correct the number and try again.";
}

// Store user details
this.username = username;
this.password = password;
this.cellNumber = cellNumber;

return "Password successfully captured.";
}

// Login user
public boolean loginUser(String username, String password) {
return this.username != null &&
this.username.equals(username) &&
this.password != null &&
this.password.equals(password);
}

// Return login status message
public String returnLoginStatus(String username, String password) {
if (loginUser(username, password)) {
return "Welcome " + username + " it is great to see you again.";
} else {
return "Username or password incorrect, please try again.";
}
}

// Getters for testing
public String getUsername() { return username; }
public String getPassword() { return password; }
public String getCellNumber() { return cellNumber; }
}
