//3-wap to print no. from 10 to 5 using do while loop
#include<stdio.h>
int main()
{
	int num=10;
	do
	{
		printf("\n %d",num);
		num=num-1;   //num--
	}
	while(num>=5);
}

