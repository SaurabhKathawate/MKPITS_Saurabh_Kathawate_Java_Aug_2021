import java.util.Locale;

public class Nul_Pointer_Q2 {
    public static void main(String[] args) {
        String s[]=new String[5];
        s[0]="ram";
        s[1]="shyam";
        s[2]="babu bhaiya";
        System.out.println(s[0].toUpperCase(Locale.ROOT));
        System.out.println(s[1]);

        if(s[2]==null)
        {
            System.out.println("No data found");
        }
        else
        {
            System.out.println(s[2].toUpperCase(Locale.ROOT));
        }
    }
}
