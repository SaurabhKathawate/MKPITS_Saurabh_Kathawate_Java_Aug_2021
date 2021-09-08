//8-create a structure student and accept values from the user.
#include<stdio.h>
struct student
{
	int rno;
	char name[20];
	int cls;
	char course[20];
}s;
int main()
{
	printf("\nEnter Roll No: ",s.rno);
	scanf("%d",&s.rno);
	printf("\nEnter Name: ",s.name);
	fflush(stdin);
    gets(s.name);
	printf("\nEnter Class: ",s.cls);
	scanf("%d",&s.cls);
	printf("\nEnter Course: ",s.course);
	fflush(stdin);
    gets(s.course);
	
	printf("\nStudent details are:");
	printf("\n--------------------------------");
	printf("\nRoll No=%d",s.rno);
	printf("\nStudent Name=%s",s.name);
	printf("\nClass=%d",s.cls);
	printf("\nCourse=%s",s.course);
	
}
