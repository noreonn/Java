import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating a scanner object for user input
        Scanner uI = new Scanner(System.in);
        
        // Initializing variables
        double monthlyCost = 0;
        double freeMinutes = 0;
        double freeTexts = 0;
        double totalCostOfTexts = 0;
        double totalCostOfMinutes = 0;
        double totalBillCost = 0;
        
        // Prompting user to choose tariff type
        System.out.println("Choose your tariff type 1-4 : ");
        double tariffType = uI.nextInt();
        
        // Prompting user for usage details
        System.out.println("How many minutes have you used: ");
        int minutes = uI.nextInt();
        
        System.out.println("How many texts have you sent: ");
        int texts = uI.nextInt();
        
        // Determining tariff details based on user input
        if (tariffType == 1){
            monthlyCost = 10;
            freeMinutes = 75;
            freeTexts = 250;
        }
        else if (tariffType == 2){
            monthlyCost = 15;
            freeMinutes = 150;
            freeTexts = 250;
        }
        else if (tariffType == 3){
            monthlyCost = 20;
            freeMinutes = 300;
            freeTexts = 300;
        }
        else if (tariffType == 4){
            monthlyCost = 25;
            freeMinutes = 300;
            freeTexts = 0;
        }
        
        // Calculating extra costs for minutes and texts if exceeded free allowance
        if(minutes > freeMinutes){
            totalCostOfMinutes = (minutes - freeMinutes) * 0.12;
        }
        if(texts > freeTexts && tariffType != 4){
            totalCostOfTexts = (texts - freeTexts) * 0.07;
        }
        
        // Displaying usage details and bill cost
        System.out.println("You were on your phone for "+minutes+" minutes");
        System.out.println("You sent "+texts+" texts");
        
        // Calculating total bill cost
        totalBillCost = totalCostOfTexts + totalCostOfMinutes + monthlyCost;
        System.out.println("\nThe total cost of your calls was "+totalCostOfMinutes+" pounds");
        System.out.println("And the cost of your texts was "+totalCostOfTexts+" pounds");
        System.out.println("The total cost of your bill was "+totalBillCost+" pounds");
    }
}
