import java.text.DecimalFormat;
import java.util.Scanner;

public class TD3_Calculator {

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        
        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Page of exercise: (1,2,3,4,5) / 0 = exit");
            int page = sc.nextInt();
            
            switch (page)
            {
                case 0:
                {
                    System.exit(0);
                    sc.close();
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
                    double iii = (n0*n0*p0) + (n1*n1*p1) + (n2*n2*p2);
                    double iv = iii - (ii*ii);

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
                    
                    double gain = (m1*36 + m2*5*6 + m3*25 + perte*125)/216;
                    System.out.println("Your gain is " + df.format(gain) + " Euro.");
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
                        chances += (success*Math.pow(echec, i))*(i+1);
                        if(i == (revolver-1))
                        {
                            chances += (Math.pow(echec, i+1))*(i+1);
                        }
                    }
                    System.out.println("Average shots = " + df.format(chances));
                }
                break;

                case 4:
                {
                    System.out.println("(i) Dice Number: ");
                    int diceNr = sc.nextInt();
                    double i =  diceNr*0.16666666666;
                    System.out.println("Average = " + df.format(i));
                    System.out.println("(ii) Probability: ");
                    double probability = sc.nextDouble();
                    double ii = 1/(1-probability);
                    System.out.println("Probability = " + df.format(ii));
                }
                break;

                case 5:
                {
                    System.out.println("Total of children: ");
                    int children = sc.nextInt();
                    System.out.println("Total of boys: ");
                    int boysNr = sc.nextInt();
                    System.out.println("Chances of having boys: ");
                    double probability = sc.nextDouble();
                    double i = Math.pow(probability, boysNr)*Math.pow(1-probability, children-boysNr);
                    System.out.println("Probability of exactly " + boysNr + " boys = " + df.format(i));
                    double ii = 0;
                    int o = 0;
                    for(int j = children; j > (children-boysNr); j--)
                    {
                        ii += Math.pow(1-probability, j)*Math.pow(probability, o);
                        o++;
                    }
                    System.out.println("(ii) Probability of less boys than girls = " + df.format(ii));
                }
                break;

                default:
                {
                    System.out.println("TG decken");
                }
                break;
            }
            
        }

    }
    
}
