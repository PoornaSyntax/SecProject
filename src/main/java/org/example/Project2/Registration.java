package org.example.Project2;

public  class Registration {
    /*
    Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
     */

        private String email;
        private String userName;
        private String password;

        public Registration(String email, String userName, String password) {
           this.email = email;
           this.userName= userName;
            this.password=password;
        }

        public void setEmail(String email) {
            if (isValidEmail(email)) {
                this.email = email;
                System.out.println("Email set successfully: " + email);
            } else {
                System.out.println("Invalid email format. Please use Yahoo email.");
            }
        }

         public void setUserName(String userName) {
            if (isValidUserName(userName)) {
                this.userName = userName;
                System.out.println("Username set successfully: " + userName);
            } else {
                System.out.println("Invalid username. Username should not be empty and should be at least 6 characters long.");
            }
        }

        public void setPassword(String password) {
            if (isValidPassword(password)) {
                this.password = password;
                System.out.println("Password set successfully.");
            } else {
                System.out.println("Invalid password. Password should not be empty, should be at least 6 characters long, and should not contain the username.");
            }
        }

        // method to validate email format
        private boolean isValidEmail(String email) {
            return email.toLowerCase().endsWith("@yahoo.com");

        }

        // method to validate username format
        private boolean isValidUserName(String userName) {
            return !userName.isEmpty() && userName.length() > 6;
        }

        // method to validate password format
        private boolean isValidPassword(String password) {
            return !password.isEmpty() && password.length() > 6 && !password.contains(userName);
        }

        // Method to display user information
        public void displayUserInfo() {
            System.out.println("Email: " + email);
            System.out.println("Username: " + userName);
        }

        public static void main(String[] args) {

            Registration user = new Registration("abc@yahoo.com", "user123", "password123");

            // Display user information
            user.displayUserInfo();
        }
    }




