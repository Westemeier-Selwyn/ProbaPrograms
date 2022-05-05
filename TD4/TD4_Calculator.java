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
                    sc.close();
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
                    double st1 = sc.nextDouble();
                    System.out.println("1) Please enter third value: ");
                    double rd1 = sc.nextDouble();

                    double result1 = 0;

                    if(st1 < 0)
                    {
                        result1 = pr(-st1) + pr(rd1);
                    }
                    else
                    {
                        result1 = pr(rd1) - pr(st1);
                    }
                    
                    System.out.println("- Result = " + result1);

                    System.out.println("2) Please enter first value: ");
                    double st2 = sc.nextDouble();
                    System.out.println("2) Please enter third value: ");
                    double rd2 = sc.nextDouble();

                    double result2 = 0;

                    if(st2 < 0)
                    {
                        result2 = pr(-st2) + pr(rd2);
                    }
                    else
                    {
                        result2 = pr(rd2) - pr(st2);
                    }
                    
                    System.out.println("- Result = " + result2);

                    System.out.println("3) Please enter value: ");
                    double st3 = sc.nextDouble();

                    double result3 = 0;

                    if(st3 < 0)
                    {
                        result3 = 0.5 - pr(-st3);
                    }
                    else
                    {
                        result3 = 0.5 + pr(st3);
                    }

                    System.out.println("- Result = " + result3);

                    System.out.println("4) Please enter value: ");
                    double st4 = sc.nextDouble();

                    double result4 = 0;

                    if(st4 < 0)
                    {
                        result4 = 0.5 + pr(-st4);
                    }
                    else
                    {
                        result4 = 0.5 - pr(st4);
                    }

                    System.out.println("- Result = " + result4);

                }
                break;
                case 4:
                {
                    System.out.println("1) Please enter value: ");
                    double st1 = sc.nextDouble();

                    double result1 = rp(st1);
                    
                    System.out.println("- Result = " + result1);

                    System.out.println("2) Please enter value: ");
                    double st2 = sc.nextDouble();


                    double result2 = rp(st2+pr(1));
                    
                    System.out.println("- Result = " + result2);

                    System.out.println("3) Please enter value: ");
                    double st3 = sc.nextDouble();

                    double result3 = rp(st3-0.5);

                    System.out.println("- Result = " + result3);

                    System.out.println("4) Please enter value: ");
                    double st4 = sc.nextDouble();

                    double result4 = rp(0.5-st4);

                    System.out.println("4) Result = " + result4);
                }
                break;
                case 5:
                {
                    System.out.println("Please enter average: ");
                    double moyenne = sc.nextDouble();
                    System.out.println("Please enter deviation: ");
                    double ecart = sc.nextDouble();

                    double st = (30 - moyenne) / ecart;
                    if(st < 0)
                    {
                        st = st*-1;
                    }
                    double result = 0.5 - pr(st);
                    System.out.println("Result = " + result);
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

    static double pr(double i)
    {
        StNoDi l = new StNoDi();
        return l.PR(i);
    }

    static double rp(double j)
    {
        StNoDi l = new StNoDi();

        double temp = 0;
        j = (int) (j*10000);

        for(double i = 0; i < 400; i += 0.01)
        {
            double temp0 = l.PR(i);
            temp0 = (int) (temp0 * 10000);
            if(temp0 == j)
            {
                temp = i;
                break;
            }
        }
        return temp;
    }

}