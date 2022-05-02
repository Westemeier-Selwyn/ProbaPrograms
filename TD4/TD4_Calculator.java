import java.text.DecimalFormat;
import java.util.Scanner;

public class TD4_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Please enter the page: (1,2,3,4,5 -- 0 = exit)");
            int page = sc.nextInt();
            switch(page)
            {
                case 0:
                    System.exit(0);
                break;
                case 1:
                {
                    System.out.println("Please enter number of fish per day: ");
                    double moyenne = sc.nextDouble();
                    System.out.println("(i) Please enter exact number of fish: ");
                    int toCatch = sc.nextInt();
                    System.out.println("(ii) Please enter minimum number of fish: ");
                    double minCatch = sc.nextDouble();

                    double i = (Math.pow(moyenne, toCatch) * Math.pow(Math.E, -moyenne))/factorial(toCatch);

                    double ii = 1;
                    for(int j = 0; j < minCatch; j++)
                    {
                        ii -= (Math.pow(moyenne, j) * Math.pow(Math.E, -moyenne))/factorial(j);
                    }

                    System.out.println("(i) = " + df.format(i));
                    System.out.println("(ii) = " + df.format(ii));
                }
                break;
                case 2:
                {
                    System.out.println("Please enter number of screws: ");
                    int total = sc.nextInt();
                    System.out.println("Please enter number of defect screws: ");
                    int totalD = sc.nextInt();
                    System.out.println("Please enter number of screws to take: ");
                    int take = sc.nextInt();
                    System.out.println("Please enter number of defect srews to have: ");
                    int takeDef = sc.nextInt();

                    double above = (combin(totalD, takeDef) * combin(total-totalD, take-takeDef));
                    double under = combin(total, take);

                    double i = above/under;

                    System.out.println("Probability = " + df.format(i));
                }    
                break;
                case 3:
                {
                    System.out.println("1) Please enter first value: ");
                    double st0 = sc.nextDouble();
                    System.out.println("1) Please enter third value: ");
                    double rd0 = sc.nextDouble();

                    double result1 = 0;

                    if(st0 < 0)
                    {

                    }

                }
                break;
                case 4:
                {

                }
                break;
                case 5:
                {

                }
                break;
                default:
                {
                    System.out.println("Oye Como Va");
                }
                break;
            }
        }
        
    }
    static int factorial(int n)
    {
        if (n == 0)
          return 1;
          
        return n*factorial(n-1);
    }
    private static final DecimalFormat df = new DecimalFormat("0.00");

    static int combin(int i, int j)
    {
        int combin = 0;
        combin = factorial(i);
        combin = combin/(factorial(j)*factorial(i-j));
        return combin;
    }

    static double loiNormP(double i)
    {
        
    }
}