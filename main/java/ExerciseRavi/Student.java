package ExerciseRavi;

public class Student {
    String name;
    int age;
    int class1;
    int rollNo;
    String address;
    String parentName;
    public Student(String name, int age, int class1, int rollNo, String address, String parentName) {
        this.name = name;
        this.age = age;
        this.class1 = class1;
        this.rollNo = rollNo;
        this.address = address;
        this.parentName = parentName;
    }

//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                ", class1=" + class1 +
//                ", rollNo=" + rollNo +
//                ", address='" + address + '\'' +
//                ", parentName='" + parentName + '\'' +
//                '}';
//    }

    public static void main(String[] args) {
        Student student =new Student("Ravi",24,12,5656,"ABCD","TEST");
        System.out.println(student);
    }
}
