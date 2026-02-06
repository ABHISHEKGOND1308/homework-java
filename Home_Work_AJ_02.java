import java.util.Scanner;

public class Home_Work_AJ_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double Basic = scanner.nextDouble();

        double HRA;
        double DA;

        if (Basic >= 30000) {
            HRA = Basic * 0.20;
            DA = Basic * 0.15;
        } 
        else {
            HRA = Basic * 0.10;
            DA = Basic * 0.08;
        }

        double PF = Basic * 0.12;
        double Net_Salary = Basic + HRA + DA - PF;

        System.out.println("HRA: " + HRA);
        System.out.println("DA: " + DA);
        System.out.println("PF: " + PF);
        System.out.println("Net Salary: " + Net_Salary);

        scanner.close();
    }
}
