package aa;

public class Student1 {

    String name;
    int marks;

    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();

        System.out.println(s1.name + " " + s1.marks);
        System.out.println(s2.name + " " + s2.marks);

        System.out.println("____________________");

        s1.name = "Tom";
        s1.marks = 36;

        s2.name = "Jerry";
        s2.marks = 40;


        System.out.println(s1.name + " " + s1.marks);
        System.out.println(s2.name + " " + s2.marks);
    }
}