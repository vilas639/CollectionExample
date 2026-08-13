package scaller.lld.accessmodifiers;

public class Client {

    public static void main(String[] args) {
        Student student = new Student();
        student.name = "naman";
//        student.address = "hello"; will not work
        student.email = "naman@scaler.com";

        Student newStudent = new Student();
//        newStudent.name = "Naman";
    }
}
