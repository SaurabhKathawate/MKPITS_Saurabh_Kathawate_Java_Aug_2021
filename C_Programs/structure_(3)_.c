//3-create a structure employee with members empno, empname, designation and salary.
struct employee
{
	int empno;
	char empname[20];
	char desg[10];
	float sal;
}e1;
int main()
{
	//struct employee e1;
	e1.empno=123;
	strcpy(e1.empname,"Saurabh");
	strcpy(e1.desg,"Manager");
	e1.sal=23881.5f;
	
	printf("\nEmployee Number=%d",e1.empno);
	printf("\nEmployee Name=%s",e1.empname);
	printf("\nEmployee Designation=%s",e1.desg);
	printf("\nEmployee Salary=%.2f",e1.sal);
}
