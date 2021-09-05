//5-wap to print table of a number.
#include<stdio.h>
int main()
{
	int num,table,i=1;
	char ans;
	do
	{
		printf("\n Enter number: ");
	    scanf("%d",&num);
	    i=1;
	    while(i<=10)
	    {
	        table=num*i;
		    i=i+1;
		    printf("\n %d * %d = %d",num,i,table);
		}
		printf("\n Do you want to continue if yes press y otherwise n: ");
        fflush(stdin);
        scanf("%c",&ans);
    }
	while(ans=='y');
	printf("\ The End");
}

