//7-Write a C program to find the eligibility of admission for a professional course based on the following criteria:
#include<stdio.h>
int main()
{
	int maths,phy,chem,total,mp;
	printf("Enter Marks ");
	scanf("%d%d%d",&maths,&phy,&chem);
	total=maths+phy+chem;
	printf("\nTotal marks=%d",total);
	mp=maths+phy;
	printf("\nMaths+Physics=%d",mp);
	if(maths>=65 && phy>=55 && chem>=50 && total>=190)
	{
		printf("\nYou are eligible");
	}
	else if(phy+maths>=140)
	{
		printf("\nYou are eligible");
	}
	else
	{
		printf("\nYou are not eligible");
	}
}

