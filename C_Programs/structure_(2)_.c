//2-create a struture student with members rno,name,course, address,mobileno
struct student
{
	int rno;
	char name[20];
	char course[10];
	char address[20];
	double mobno;
}s1;

int main()
{
	//creating a structure variable
	//struct student s1;    // s1 is structure variable
	//assigning value to structure members
	s1.rno=10;
	strcpy(s1.name,"Saurabh");
	strcpy(s1.course,"BE Mech");
	strcpy(s1.address,"Nagpur,Maharashtra");
	s1.mobno=9028436561;
	//displaying the values stored in structure
	printf("\nRoll_no=%d",s1.rno);
	printf("\nName=%s",s1.name);
	printf("\nCourse=%s",s1.course);
	printf("\nAddress=%s",s1.address);
	printf("\nMobile_No=%.0lf",s1.mobno);
}
