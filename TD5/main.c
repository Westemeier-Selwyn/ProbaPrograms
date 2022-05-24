#include<stdio.h>
#include<stdlib.h>

int main() {

    while (1)
    {
        printf("Please enter the page you are working on: \n");

    int choice;
    scanf("%d", &choice);

    switch(choice)
    {
        case 0:

        printf("Bye Bye!");
        exit(0);

            break;

        case 1:
        {
            printf("Please enter the values in \"?\"\n\n");
            double x0,x1,x2,x3,x4,x5,x6,x7;
            printf("P(x1,x2)|   ?\t|  \t|\n");
            printf("------------------------|\n");
            printf("  \t|  \t|  \t|\n");
            printf("------------------------|\n");
            printf("  \t|  \t|  \t|\n");

            scanf("%lf", &x0);

            printf("P(x1,x2)|  %.2lf\t|   ?\t|\n", x0);
            printf("------------------------|\n");
            printf("  \t|  \t|  \t|\n");
            printf("------------------------|\n");
            printf("  \t|  \t|  \t|\n");

            scanf("%lf", &x1);

            printf("P(x1,x2)|  %.2lf\t|  %.2lf\t|\n", x0, x1);
            printf("------------------------|\n");
            printf("   ?\t|  \t|  \t|\n");
            printf("------------------------|\n");
            printf("  \t|  \t|  \t|\n");

            scanf("%lf", &x2);

            printf("P(x1,x2)|  %.2lf\t|  %.2lf\t|\n", x0, x1);
            printf("------------------------|\n");
            printf("  %.2lf\t|   ?\t|  \t|\n", x2);
            printf("------------------------|\n");
            printf("  \t|  \t|  \t|\n");

            scanf("%lf", &x3);

            printf("P(x1,x2)|  %.2lf\t|  %.2lf\t|\n", x0, x1);
            printf("------------------------|\n");
            printf("  %.2lf\t|  %.2lf\t|   ?\t|\n", x2, x3);
            printf("------------------------|\n");
            printf("  \t|  \t|  \t|\n");

            scanf("%lf", &x4);

            printf("P(x1,x2)|  %.2lf\t|  %.2lf\t|\n", x0, x1);
            printf("------------------------|\n");
            printf("  %.2lf\t|  %.2lf\t|  %.2lf\t|\n", x2, x3, x4);
            printf("------------------------|\n");
            printf("   ?\t|  \t|  \t|\n");

            scanf("%lf", &x5);

            printf("P(x1,x2)|  %.2lf\t|  %.2lf\t|\n", x0, x1);
            printf("------------------------|\n");
            printf("  %.2lf\t|  %.2lf\t|  %.2lf\t|\n", x2, x3, x4);
            printf("------------------------|\n");
            printf("  %.2lf\t|   ?\t|  \t|\n", x5);

            scanf("%lf", &x6);

            printf("P(x1,x2)|  %.2lf\t|  %.2lf\t|\n", x0, x1);
            printf("------------------------|\n");
            printf("  %.2lf\t|  %.2lf\t|  %.2lf\t|\n", x2, x3, x4);
            printf("------------------------|\n");
            printf("  %.2lf\t|  %.2lf\t|   ?\t|\n", x5, x6);

            scanf("%lf", &x7);

            printf("P(x1,x2)|  %.2lf\t|  %.2lf\t|\n", x0, x1);
            printf("------------------------|\n");
            printf("  %.2lf\t|  %.2lf\t|  %.2lf\t|\n", x2, x3, x4);
            printf("------------------------|\n");
            printf("  %.2lf\t|  %.2lf\t|  %.2lf\t|\n\n", x5, x6, x7);

            double i = (x0*x2*x3 + x1*x2*x4 + x0*x5*x6 + x1*x5*x7);
            double ii = ((x0*(x3+x6)+x1*(x4+x7))*(x2*(x3+x4)+x5*(x6+x7)));

            printf("E[x1·x2] = %.2lf\n", i);
            printf("E[x1]·E[x2] = %.2lf\n\n", ii);
            if(i == ii)
            {
                printf("On peut conclure que les deux variables aléatoires sont indépendantes.\n");
            } else 
            {
                printf("On peut conclure que les deux variables aléatoires ne sont pas indépendantes.\n");
            }
        }
            break;

        case 2:
        {

        }
            break;
        
        default:
            break;
    }
    }

    return 0;
}