import java.util.*;
public class TaxCollection {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double income[]=new double[10];
        double totaltax=0;

        for(int i=0;i<10;i++){
            System.out.print("Enter income of citizen " + (i + 1) + ": ");
            income[i]= sc.nextDouble();
        }
        for (int i=0;i<10;i++){
          double tax;
          String brackets;
          if(income[i]<10000){
              tax=income[i]*0.05;
              brackets="5%";
          } else if (income[i]<=50000) {
              tax=income[i]*0.15;
              brackets="15%";
          }
          else{
              tax=income[i]*0.30;
              brackets="30%";
          }
          totaltax+=tax;
            System.out.println("Citizen " + (i + 1) + " | Income = " + income[i] + " | Bracket = " + brackets + " | Tax = " + tax);
        }
        System.out.println("\nTotal Tax Collected = " + totaltax);
    }
}
