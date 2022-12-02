package designpatterns.builder;

public class Client {
    public static void main(String[] args) {

        Student s=Student.getBuilder()
                .setAge(24)
                .setName("Naman")
                .setPsp(90)
                .build();

//        Student.Builder builder=Student.getBuilder();
//
//        builder.setAge(24);
//        builder.setName("Naman");
//        builder.setPsp(90);

//        Student s=builder.build();

        //Student s=Student.getBuilder();
        //                 .setName("Naman");
        //                 .setAge(24);
        //                 .build();
    }
}
