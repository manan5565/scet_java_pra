import CE_Dept.*;
import IT_Dept.*;

//Create two packages, CE_Dept & IT_Dept with Machine_Detail_CE and Machine_Detail_IT classes respectively. The class should have a method to display machine information (No_of_PC(int), configuration(String)) for both departments. Write a java application that imports both defined packages and call their methods.

public class pra_15 {
    public static void main(String[] args) {
        Machine_Detail_CE c = new Machine_Detail_CE();
        c.No_of_PC(10);
        c.configuration("core i5 10th Generation", "4 GB", "10");
        Machine_Detail_IT i = new Machine_Detail_IT();
        i.No_of_PC(15);
        i.configuration("core i5 11th Generation", "8 GB", "11");
    }
}
