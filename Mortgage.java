import java.text.NumberFormat;
import java.util.*;
public class Mortgage {
    public static void main(String[] args) {
        int principle;
        double Annualrate, TimeinYears, result;
        Scanner obj = new Scanner(System.in);
        System.out.println("Mortgage");
        System.out.print("Principle :");
        principle = obj.nextInt();
        System.out.print("Rate :");
        Annualrate = obj.nextDouble();
        System.out.print("Time :");
        TimeinYears = obj.nextInt();
        double numberOfpayments=TimeinYears*12;
        double monthlyInterest = Annualrate / 100/12;
        result = principle * (monthlyInterest * (Math.pow(1 + monthlyInterest, numberOfpayments) / ((Math.pow(1 + monthlyInterest, numberOfpayments) - 1))));
        String resultformatted= NumberFormat.getCurrencyInstance().format(result);
        System.out.println("Mortgage"+resultformatted);
    }
}


