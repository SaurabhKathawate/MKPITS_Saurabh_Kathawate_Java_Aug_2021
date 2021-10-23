//Anonymous Array in Java

//Java supports the feature of an anonymous array, so you don't need to declare the array while passing an array to the method.

    class Array_Q8{
    //creating a method which receives an array as a parameter
    static void min(int arr[]){
    int min=arr[0];
    for(int i=1;i<arr.length;i++)
     if(min>arr[i])
      min=arr[i];

    System.out.println(min);
    }

    public static void main(String args[]){
    //int a[]={33,31,4,5};//declaring and initializing an array
    min(new int[] {1,5,3,4,7});//passing array to method
    }}

