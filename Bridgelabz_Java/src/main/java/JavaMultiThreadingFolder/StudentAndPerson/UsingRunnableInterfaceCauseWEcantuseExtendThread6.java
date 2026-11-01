package JavaMultiThreadingFolder.StudentAndPerson;


class Person {
    void introduce() {
        System.out.println("I am a person.");
    }
}

class Student extends Person implements Runnable {
    @Override
    public void run() {
        System.out.println("Student is studying.");
    }
}

public class UsingRunnableInterfaceCauseWEcantuseExtendThread6 {
    public static void main(String[] args) {
        Student student = new Student();

        student.introduce();

        Thread t = new Thread(student);
        t.start();
    }

}
// I am a person.
// Student is studying.