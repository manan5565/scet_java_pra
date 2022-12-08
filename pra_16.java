//Write a simple java application that reads marks of five subjects through command line arguments and displays the average. The application should generate an exception if marks are not in integer format and out of 0-100.
public class pra_16 {
    static int avg;

    public static void main(String[] args) {
        System.out.println("Entered Subject Marks are:-");
        System.out.println("Sub1:" + args[0] + "\nsub2:" + args[1] + " \nsub3:" + args[2] + "\nsub4:" + args[3]
                + "\nsub5:" + args[4]);

        int sub1, sub2, sub3, sub4, sub5;
        try {
            sub1 = Integer.parseInt(args[0]);
            sub2 = Integer.parseInt(args[1]);
            sub3 = Integer.parseInt(args[2]);
            sub4 = Integer.parseInt(args[3]);
            sub5 = Integer.parseInt(args[4]);
            for (int i = 0; i < 5; i++) {
                if (Integer.parseInt(args[i]) < 0 || Integer.parseInt(args[i]) > 100) {
                    throw new InvalidMarksException();
                } else {
                    avg = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;
                }

            }

            System.out.println("Average of 5 Subjects is " + avg);

        } catch (NumberFormatException e) {
            System.out.println("Enter Only Integers!!");
        } catch (InvalidMarksException e) {
            System.out.println("Enter data rang between 0-100");
        }

    }
}

class InvalidMarksException extends Exception {
    InvalidMarksException() {

    }
}
