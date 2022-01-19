import java.util.Optional;

public class Nul_Pointer_Q5 {
    public static void main(String[] args) {
        String s[] = new String[5];
        s[0] = "ram";
        /*
        s[1] = "shyam";
        s[2] = "babu bhaiya";
        System.out.println(s[0].toUpperCase(Locale.ROOT));
        System.out.println(s[1].toUpperCase(Locale.ROOT));
        */
        //second way
        Optional<String> obj=Optional.of(s[2]);
        System.out.println(obj);
    }
}