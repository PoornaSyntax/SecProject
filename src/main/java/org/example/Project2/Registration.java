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


        public void setEmail(String email) {
              this.email = email;
            if (email.endsWith("@yahoo.com")) {

                System.out.println("Email set successfully ");
            } else {
                System.out.println("Invalid email format. Please use Yahoo email.");
            }
        }

         public void setUserName(String userName) {
             this.userName = userName;
            if (userName.length()>6) {

                System.out.println("Username set successfully " );
            } else {
                System.out.println("Invalid username. Username should not be empty and should be at least 6 characters long.");
            }
        }

        public void setPassword(String password) {
            this.password = password;
            if (password.length()>6 && !password.contains(userName)) {

                System.out.println("Password set successfully.");
            } else {
                System.out.println("Invalid password. Password should not be empty, should be at least 6 characters long, and should not contain the username.");
            }
        }



        // Method to display user information
        public void displayUserInfo() {
            System.out.println("Email: " + email);
            System.out.println("Username: " + userName);
        }

        public static void main(String[] args) {

            Registration user= new Registration();
             user.setEmail("abc@yahoo.com");
             user.setUserName("JohnSmith1");
             user.setPassword("JohnSmith123");
            user.displayUserInfo();
        }
    }




