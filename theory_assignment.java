import java.util.Scanner;

class student{
    String name;
    int registration_no;
    String department;

    public student(String name, int registration_no, String department) {
        this.name = name;
        this.registration_no = registration_no;
        this.department = department;
    }

    public void display(){
        System.out.println("Student name = "+name);
        System.out.println("Student registration number = "+registration_no);
        System.out.println("Student department = "+department);


    }


}


class Exam extends student{
    int marks;
    double total_marks;

    public Exam(String name, int registration_no, String department, int marks, double total_marks) {
        super(name, registration_no, department);
        this.marks = marks;
        this.total_marks = total_marks;
    }
    double percentage;

    public void percentage(){
        percentage = (marks / total_marks) * 100;
        System.out.println("percentage = "+percentage);
    }
    public void cgpa(){
        double cgpa = (percentage / 100) * 4.0;
        System.out.println("cgpa = "+cgpa);
    }

}

class finance extends student{
    float course_fee;
    int no_of_courses;

    public finance(String name, int registration_no, String department, float course_fee, int no_of_courses) {
        super(name, registration_no, department);
        this.course_fee = course_fee;
        this.no_of_courses = no_of_courses;
    }

    public void fee(){
        double total_fee;

        System.out.println("fees = "+(course_fee*no_of_courses));
    }
}







public class theory_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int reg;
        String dep;
        int marks;
        double total;
        float fee;
        int noc;

        System.out.println("enter name =  ");
        name = sc.nextLine();
        Scanner obj = new Scanner(System.in);
        System.out.println("enter registration number = ");
        reg = obj.nextInt();
        System.out.println("enter department = ");
        dep = sc.nextLine();
        System.out.println("enter total marks = ");
        total = obj.nextDouble();
        System.out.println("enter obtained marks = ");
        marks = obj.nextInt();
        System.out.println("enter course fee = ");
        fee = obj.nextFloat();
        System.out.println("enter no of courses = ");
        noc = obj.nextInt();

        Exam e = new Exam(name,reg,dep,marks,total);
        finance f = new finance(name,reg,dep,fee,noc);

        e.display();
        e.percentage();
        e.cgpa();

        f.fee();



        sc.close();

    }
}
