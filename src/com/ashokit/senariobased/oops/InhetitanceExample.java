package com.ashokit.senariobased.oops;

/*
Design a library system where different types of members have specific privileges.
Answer:

Use Inheritance and Polymorphism:
 */
public class InhetitanceExample {

    public static void main(String[] args) {

        Student s= new Student();
        s.borrowBook();
        Professor p=new Professor();
        p.borrowBook();
    }
}


 abstract class LibraryMember {
    public abstract void borrowBook();
}

 class Student extends LibraryMember {
    @Override
    public void borrowBook() {
        System.out.println("Student can borrow up to 3 books.");
    }
}

 class Professor extends LibraryMember {
    @Override
    public void borrowBook() {
        System.out.println("Professor can borrow up to 10 books.");
    }
}
