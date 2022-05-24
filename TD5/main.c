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

        int x0,x1,x2,x3,x4,x5,x6,x7,x8;

        printf("Please enter the value of \"?\"\n\n");
        printf("P(x1,x2)|   ?\t|\t|\n");
        printf("------------------------|\n");
        printf("\t|\t|\t|\n");
        printf("------------------------|\n");
        printf("\t|\t|\t|\n");

        scanf("%f", &x0);

        printf("P(x1,x2)|   %f\t|\t|\n", &x0);
        printf("------------------------|\n");
        printf("\t|\t|\t|\n");
        printf("------------------------|\n");
        printf("\t|\t|\t|\n");


        

            break;
        
        default:
            break;
    }
    }

    return 0;
}