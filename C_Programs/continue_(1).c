//2-continue: Continue statement will skip the remaining statement coming after continue statement inside loop
// and will continue to execute from next iteration.
#include<stdio.h>
int main() 
{
	int i=0;
	while(i<5) 
	{
		i++;
		if(i==3) 
		{
			continue;
		}
		printf("\n i=%d",i); //1 2 4 5  
	}
	printf("\n out of while loop");
}

