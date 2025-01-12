package com.ashokit.senariobased.oops;

import com.ashokit.designpattern.creation.Builder.UserWithBuilder;
import com.ashokit.designpattern.creation.Builder.UserWithoutBuilderExample;

/*
How would you enforce mandatory properties in a class?
Answer:

Use the Builder Pattern:
 */
public class BuilderPatternExample {

    public static void main(String[] args) {


        User.UserBuilder1 u = new User.UserBuilder1("vilas","email");
        User.UserBuilder1 u1 = new User.UserBuilder1("vilas","email");

    }
}

 class User {
    private final String name;
    private final String email;

    private User(UserBuilder1 builder) {
        this.name = builder.name;
        this.email = builder.email;
    }

    public static class UserBuilder1 {
        private final String name;
        private final String email;

        public UserBuilder1(String name, String email) {
            this.name = name;
            this.email = email;
        }


        public User build() {
            return new User(this);
        }
    }
}
