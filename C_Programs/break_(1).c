//1-example of break; (break- used to come out of the loop immediately)

#include<stdio.h>
int main() 
{
	int i=0;
	while(i<=10) 
	{
		printf("\n i=%d",i);
		i++;
		if(i>3) 
		{
			break;
		}
	}
	printf("\n out of while loop");
}

