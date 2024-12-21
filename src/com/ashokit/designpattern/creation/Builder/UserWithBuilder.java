package com.ashokit.designpattern.creation.Builder;


//create a class 
//creaet constructor pass inner class
//create a get method
//create a inner class
//create a set method with return class name
//create a build method with parent class and return parent class
//in psvm call
//UserWithBuilder user1 = new UserWithBuilder.UserBuilder()
//.setFirstname("John")
//.setLastname("Doe")
//.build();

public class UserWithBuilder {
    private String firstname;
    private String lastname;
    private int age;
    private String mobile;

    // Private constructor to enforce the use of the Builder
    private UserWithBuilder(UserBuilder builder) {
        this.firstname = builder.firstname;
        this.lastname = builder.lastname;
        this.age = builder.age;
        this.mobile = builder.mobile;
    }

    // Getters
    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", mobile='" + mobile + '\'' +
                '}';
    }

    // Builder Class
    public static class UserBuilder {
        private String firstname;
        private String lastname;
        private int age;
        private String mobile;

        public UserBuilder setFirstname(String firstname) {
            this.firstname = firstname;
            return this;
        }

        public UserBuilder setLastname(String lastname) {
            this.lastname = lastname;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }

        public UserWithBuilder build() {
            return new UserWithBuilder(this);
        }
    }

    public static void main(String[] args) {
        // Example usage
    	UserWithBuilder user = new UserWithBuilder.UserBuilder()
                .setFirstname("John")
                .setLastname("Doe")
                .setAge(30)
                .setMobile("1234567890")
                .build();

        System.out.println(user);
        System.out.println("hashcode"+user.hashCode());
        
        UserWithBuilder user1 = new UserWithBuilder.UserBuilder()
                .setFirstname("John")
                .setLastname("Doe")
                .build();

        System.out.println(user1);
        System.out.println("hashcode"+user1.hashCode());
    }
}

