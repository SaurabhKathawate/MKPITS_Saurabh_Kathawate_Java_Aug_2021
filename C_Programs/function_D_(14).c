//D-function with return value and no parameters
//14-wap to create a 
#include<stdio.h>
// declaring a function prototype
float calculatearea();
//creating a main function
int main() 
{
	float result;
	result=calculatearea();
	printf("\nArea=%f",result);
}

float  calculatearea() 
{
	int radius;
	float area;
	printf("\nEnter radius: ");
	scanf("%d",&radius);
	area = 3.14f * radius * radius;
	return area;
}

