import java.util.Scanner;

public class TD3_Calculator {

    public static void main(String[] args) {
        
        
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Page of exercise: (1,2,3,4,5) / 0 = exit");
            int page = sc.nextInt();
            while(page > 5 || page < 0)
            {
                System.out.println("TG decken");
                page = 0;
                page = sc.nextInt();
            }
            switch (page)
            {
                case 0:
                {
                    System.exit(0);
                }
                break;

                case 1:
                {   
                    System.out.println("Please enter E(X) one by one:");
                    int n0 = sc.nextInt();
                    int n1 = sc.nextInt();
                    int n2 = sc.nextInt();
                    System.out.println("Please enter your respective probabilities:");
                    double p0 = sc.nextDouble();
                    double p1 = sc.nextDouble();
                    double p2 = sc.nextDouble();

                    double ii = n0*p0 + n1*p1 + n2*p2;
                    double iii = (n0*n0*p0) + (n1*n1*p1) * (n2*n2*p2);
                    double iv = (ii*ii) - iii;

                    System.out.println("(ii) = " + ii);
                    System.out.println("(iii) = " + iii);
                    System.out.println("(iv) = " + iv);
                }

                break;

                case 2:
                {
                    System.out.println("Please enter \"mise\":");
                    int mise = sc.nextInt();
                    System.out.println("First try:");
                    int m1 = sc.nextInt()*mise;
                    System.out.println("Second try:");
                    int m2 = sc.nextInt()*mise;
                    System.out.println("Third try:");
                    int m3 = sc.nextInt()*mise;
                    System.out.println("If failed:");
                    int perte = sc.nextInt()*mise;
                    
                    double gain = m1*(1/6) + m2*(5/36) + m3*(25/216) + perte*(125/216) - mise;
                    System.out.println("Your gain is " + gain + " €.");
                }
                break;

                case 3:
                {
                    System.out.println("Please enter number of ammunition:");
                    int revolver = sc.nextInt();
                    System.out.println("Please enter probability:");
                    double success = sc.nextDouble();
                    double echec  = 1-success;
                    double chances = 0;
                    for(int i = 0; i < revolver; i++)
                    {
                        chances += success*Math.pow(echec, i);
                        if(i == (revolver-1))
                        {
                            chances = Math.pow(echec, i+1);
                        }
                    }
                }
                break;
                
            }
        }

    }
    
}
