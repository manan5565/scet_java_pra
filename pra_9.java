import java.util.Scanner;

public class pra_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();
        int rollno;
        String temp, add, branch;

        System.out.println("Enter Student Details :- ");
        System.out.printf("Roll no :");
        rollno = scanner.nextInt();
        System.out.printf("Name :");
        temp = scanner.next();
        System.out.printf("Address :");
        add = scanner.next();
        System.out.printf("Branch :");
        branch = scanner.next();

        student.getData(rollno, temp, add, branch);
        student.showData();
        scanner.close();

    }
}

class Student {
    int roll_no;
    String name;
    String address;
    String branch;

    public void getData(int r, String name, String add, String bra) {
        this.roll_no = r;
        this.name = name;
        this.address = add;
        this.branch = bra;
    }

    public void showData() {
        System.out
                .println("Roll no is " + roll_no + " , Name = " + name + " , Address = " + address
                        + " , Branch = " + branch);
    }

    static void branchDisplay(Student s) {
    }

}
