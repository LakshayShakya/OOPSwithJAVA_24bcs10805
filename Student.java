public class Student {
    String name;
    double uid;
    double classNo;

    Student() {
        this.name = "";
        this.uid = 0;
        this.classNo = 0;
    }

    Student(String name, double uid, double classNo) {
        this.name = name;
        this.uid = uid;
        this.classNo = classNo;
    }

    public void show() {
        System.out.println(this.name);
        System.out.println(this.uid);
        System.out.println(this.classNo);
    }

    public static void main(String[] args) {
        Student s = new Student("Lakshay", 10805, 616);
        s.show();
    }
}
