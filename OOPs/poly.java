


class Student{
    String name;
    int age;

    public void studentinfo(String name, int age){
        System.out.println(name+age);
    }
    public void studentinfo( int age){
        System.out.println(age);
    }
}
public class poly {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "manas";
        s1.age = 22;
        s1.studentinfo(s1.name, s1.age);
        s1.studentinfo(s1.age);

    }
}
