//Java String Example

public class String_Q1{
    public static void main(String args[]){
    String s1="java";//creating string by java string literal
    System.out.println(s1);

	char ch[]={'s','t','r','i','n','g','s'};
    String s2=new String(ch);//converting char array to string
    System.out.println(s2);

    String s3=new String("example");//creating java string by new keyword
    System.out.println(s3);
    }
}
