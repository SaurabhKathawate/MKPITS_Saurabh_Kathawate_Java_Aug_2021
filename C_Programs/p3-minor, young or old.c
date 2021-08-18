//3- wap to accept age and print whether he is minor, young or old
#include<stdio.h>
void main(){
	int age;
	printf("enter age");
	scanf("%d",&age);
	if(age<18){
		printf("/n You are minor");
	}
	else if(age>=18 && age<45){
		printf("/n You are young");
	}
	else{
		printf("/n You are old");
	}
}
