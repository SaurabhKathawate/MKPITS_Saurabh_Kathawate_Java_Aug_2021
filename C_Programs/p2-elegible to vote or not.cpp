//2-wap to accept age and print whether he is elegible to vote or not.
#include<stdio.h>
void main(){
	int age;
	printf("enter age");
	scanf("%d",&age);
	if (age>=18){
	printf("\n you are elegible to vote");
    }
	else 
	{
	printf("\n you are not elegible to vote");
    }
}
