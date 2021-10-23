//Example of Java Array

//Let's see the simple example of java array, where we are going to declare, instantiate, initialize and traverse an array.

//Java Program to illustrate how to declare, instantiate, initialize and traverse the Java array.

    class Array_Q1{
    public static void main(String args[]){
    int arr[]=new int[5];//declaration and instantiation
    arr[0]=10;//initialization
    arr[1]=20;
    arr[2]=30;
    arr[3]=40;
    arr[4]=50;
    //traversing array
    for(int i=0;i<arr.length;i++)//length is the property of array
    System.out.println(arr[i]);
    }}
