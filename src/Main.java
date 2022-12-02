
class  Student{
    String name;
    int age;
    //int a;

    Student(){

    }
    Student(String name){
        this.name=name;
    }

    Student(int a , Student s){
        a=4;

    }

}
public class Main {


    public static void dosomething(int a,Student s){

        a=4;
        s.age=27;
        s=new Student("Ajit");
    }
    public static void main(String args[]) {
        // Your code goes here
        int a;
        a=2;
        Student s=new Student();
        s.name="Naman";
        s.age=24;
        dosomething(a,s);
        System.out.println(s.name);

    }
}
