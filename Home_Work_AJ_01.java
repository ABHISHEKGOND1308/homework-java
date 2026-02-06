import java.util.Scanner;

public class Home_Work_AJ_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Quantity: ");
        int Quantity = sc.nextInt();

        double Total_Bill = 0;

        for (int i = 1; i <= Quantity; i++) {
            System.out.print("Enter Price of Item " + i + ": ");
            double Price = sc.nextDouble();
            Total_Bill = Total_Bill + Price;
        }

        double Discount = 0;

        if (Total_Bill >= 2000) {
            if (Total_Bill >= 5000) {
                Discount = Total_Bill * 0.10;
            } else {
                Discount = Total_Bill * 0.05;
            }
        }

        double Discounted_Amount = Total_Bill - Discount;
        double GST = Discounted_Amount * 0.18;
        double Final_Amount = Discounted_Amount + GST;

        System.out.println("\n------ BILL DETAILS ------");
        System.out.println("Total_Bill: " + Total_Bill);
        System.out.println("Discount: " + Discount);
        System.out.println("Discounted_Amount: " + Discounted_Amount);
        System.out.println("GST: " + GST);
        System.out.println("Final_Amount: " + Final_Amount);

        sc.close();
    }
}