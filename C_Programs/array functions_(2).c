//2-create a array of 3 elements and pass it to the funtion display to display the elements of an array
//repeat the above program using for loop to display array elements
int main() 
{	
    int arr[3]={1,2,3};
    display(arr); //passing array to function	
    display(arr);
    
}

void display(int arr[]) // parameter is array
{
    int i;
    for(i=0;i<3;i++)
    {
    	printf("\n arr[%d] =%d",i,arr[i]);
	}
}

