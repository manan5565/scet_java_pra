import java.util.Scanner;

public class pra_9 {
    public static void main(String[] args) {
        Student[] obj = new Student[2];
        for (int i = 0; i < 2; i++) {
            obj[i] = new Student();
            obj[i].getData();
        }
        Student.branchDisplay(obj);
    }
}

class Student {
    Scanner scanner = new Scanner(System.in);

    int roll_no;
    String name;
    String address;
    String branch;

    public void getData() {
        System.out.println("\nEnter Student Details :- ");
        System.out.printf("Roll no :");
        this.roll_no = scanner.nextInt();
        System.out.printf("Name :");
        this.name = scanner.next();
        System.out.printf("Address :");
        this.address = scanner.next();
        System.out.printf("Branch :");
        this.branch = scanner.next();
    }

    public void showData() {
        System.out
                .println("Roll no is " + roll_no + " , Name = " + name + " , Address = " + address
                        + " , Branch = " + branch);
    }

    static void branchDisplay(Student[] s) { // static method called by classname.methodname
        System.out.println("\nComputer Branch Students are :-");
        for (int i = 0; i < s.length; i++) {
            if (s[i].branch.equals("Computer") || s[i].branch.equals("computer")) {
                System.out.println("Roll No : " + s[i].roll_no);
                System.out.println("Name : " + s[i].name);
                System.out.println("Address : " + s[i].address);
                System.out.println("Branch : " + s[i].branch);
            }
        }
    }

}
