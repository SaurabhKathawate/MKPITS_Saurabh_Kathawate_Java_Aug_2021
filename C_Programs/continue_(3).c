//3-wap to print even no. between 1 and 10 using continue
#include<stdio.h>
int main() 
{
	int i;
	for(i=1;i<=10;i++) 
	{
		if(i%2!=0) 
		{
			continue;
		}
		printf("\n %d", i );
	}
}

