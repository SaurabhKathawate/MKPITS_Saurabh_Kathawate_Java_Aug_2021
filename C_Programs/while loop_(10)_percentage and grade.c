//10-wap to accept 5 subject marks using while loop and print the sum of 5 subjects, calculate percentage and print grade
int main()
{
	int s1,s2,s3,s4,s5,total;
	float per;
	printf("\nEnter Marks of 5 Subjects: ");
	scanf("%d%d%d%d%d",&s1,&s2,&s3,&s4,&s5);
	per=(s1+s2+s3+s4+s5/5.0f);
	while(per>=35)
	{
		printf("\nGrade: Pass");
		break;
	}
}


