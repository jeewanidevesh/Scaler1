package package2;

class Student{
    String name;
}

public class Main {

    public static void doSomething(Student s){
        s.name="Naman";
    }
    public static void main(String args[]){
        Student a=new Student();
        a.name="Ajit";
        doSomething(a);
        System.out.println(a.name);
    }
}
