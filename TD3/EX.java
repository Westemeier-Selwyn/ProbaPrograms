import java.text.DecimalFormat;
import java.util.Scanner;

public class EX {

    private static final DecimalFormat df = new DecimalFormat("0.0000");

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number of variables: ");
        int arraysize = sc.nextInt();
        int[] st = new int[arraysize];
        double[] ts = new double[arraysize];

        System.out.println("Please enter the E[x] numbers one by one: ");
        for(int i = 0; i < arraysize; i++)
        {
            st[i] = sc.nextInt();
        }
        System.out.println("Please enter the respective probabilities one by one: ");
        for(int i = 0; i < arraysize; i++)
        {
            ts[i] = sc.nextDouble();
        }
        double average = 0;
        double power = 0;
        for(int i = 0; i < arraysize; i++)
        {
            average += st[i]*ts[i];
            power += (st[i]*st[i]*ts[i]);
        }
        double variance = power - (average*average);
        System.out.println("Average = " + df.format(average));
        System.out.println("Power = " + df.format(power));
        System.out.println("Variance = " + df.format(variance));
        
        sc.close();

    }
    
}
