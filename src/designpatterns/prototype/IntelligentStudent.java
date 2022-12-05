package designpatterns.prototype;

public class IntelligentStudent extends Student{
    int iq;

    public IntelligentStudent(){

    }

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq=student.iq;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
