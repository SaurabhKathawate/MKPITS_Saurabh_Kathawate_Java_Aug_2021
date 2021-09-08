//6-create a struture employee with members empid, empname, designation, salary.
//accept the values from user to store employee record in structure then display. 
struct employee 
{
	int empid;
	char empname[20];
	char designation[20];
	float salary;
}emp1;

int main() 
{
	//struct employee emp1;
	printf("enter empid: ");
    scanf("%d",&emp1.empid);
    printf("enter emp name: ");
    scanf("%s",&emp1.empname);
    printf("enter designation: ");
    scanf("%s",&emp1.designation);
    printf("enter salary: ");
    scanf("%f",&emp1.salary);
    printf("\nemployee details are:");
    printf("\nempid = %d",emp1.empid);
    printf("\nemp name = %s",emp1.empname);
    printf("\ndesignation = %s",emp1.designation);
    printf("\nsalary = %.2f",emp1.salary);
}

