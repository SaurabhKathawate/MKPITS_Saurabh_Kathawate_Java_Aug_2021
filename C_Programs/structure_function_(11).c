//11-wap to create a structure array of 3 elements of structure student
//create a structure student with members rno,name and address, pass this structure to function 
//display to display structure values
struct student 
{
	int rno;
	char name[20];
	char address[20];
};
//creating function declaration
void display(struct student s1);
#include<stdio.h>
int main() 
{
    struct	student stud[3]; //creating structure array of 3 elements
    int i=0;
    while(i<3 )
    {
        printf("\nenter rno ");
        scanf("%d",&stud[i].rno);
        printf("enter student name ");
        fflush(stdin);
        gets(stud[i].name);
        printf("enter address ");
        fflush(stdin);
        gets(stud[i].address);
        printf("\n--------------------------------");
        printf("\nstudent[%d] details are",i+1);
        display(stud[i]); // passing structure to function
        printf("\n--------------------------------");
        i++;
    }
}
//creating function display with structure parameter to accept structure of type student
void display(struct student s1)
{
	printf("\nrno = %d",s1.rno);
    printf("\nstudent name = %s",s1.name);
    printf("\naddress = %s",s1.address);
}
