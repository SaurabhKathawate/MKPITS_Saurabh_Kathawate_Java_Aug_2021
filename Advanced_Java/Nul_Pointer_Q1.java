import java.util.Locale;

public class Nul_Pointer_Q1 {
    public static void main(String[] args) {
        String s[]=new String[5];
        s[0]="ram";
        s[1]="shyam";
        System.out.println(s[0].toUpperCase(Locale.ROOT));
        System.out.println(s[1]);
        System.out.println(s[2]);
    }
}
