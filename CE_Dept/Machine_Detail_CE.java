package CE_Dept;

//Create two packages, CE_Dept & IT_Dept with Machine_Detail_CE and Machine_Detail_IT classes respectively. The class should have a method to display machine information (No_of_PC(int), configuration(String)) for both departments. Write a java application that imports both defined packages and call their methods.
public class Machine_Detail_CE {
    public void No_of_PC(int i) {
        System.out.println("There are " + i + " Numbers of PC's in CE Lab");
    }

    public void configuration(String pro, String ram, String wos) {
        System.out.println("Configurations CE Lab's PC :- ");
        System.out.println("Processor Details :- " + pro);
        System.out.println("RAM Details :- " + ram);
        System.out.println("OS:- Windows " + wos);
    }
}
