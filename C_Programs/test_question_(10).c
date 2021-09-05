//10-Write a program in C to calculate and print the Electricity bill of a given customer.
//The customer id., name and unit consumed by the user should be taken from the keyboard and display the total amount to pay to the customer.
#include<stdio.h>
int main()
{
	int customer_id,unit;
	float amount_charge,surcharge_amount,net_amount;
	char name[15];
	printf("\nEnter Customer id: ");
	scanf("%d",&customer_id);
	printf("\nCustomer Name: ",name);
	scanf("%s",&name);
	printf("\nEnter Unit Consumed: ");
	scanf("%d",&unit);
	
	if(unit<=199)
	{
		amount_charge=unit*1.20f;
	}
	else if(unit>=200 && unit<400)
	{
		amount_charge=unit*1.50f;
	}
	else if(unit>=400 && unit<600)
	{
		amount_charge=unit*1.80f;
	}
	else if(unit>=600 )
	{
		amount_charge=unit*2.00;
	}
	else
	{
		printf("\nInvalid Unit");
	}
	if(amount_charge <= 100)
	{
		amount_charge=100.0f;
	}
	printf("\nAamount Charge =%f",amount_charge);
	
	if(amount_charge >=400)
	{
	surcharge_amount=(float)(15/100.0f)*amount_charge;
	printf("\nSurcharge Amount =%f",surcharge_amount);
    }
	net_amount=amount_charge+surcharge_amount;
	printf("\nNet Amount paid by the Customer =%f",net_amount);
}
