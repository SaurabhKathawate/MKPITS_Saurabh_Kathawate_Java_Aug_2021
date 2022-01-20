import java.util.Base64;

public class Enc_dec_Q1 {
    public static void main(String[] args) {
        String pass="Saurabh@123";

        byte[] encode = Base64.getEncoder().encode(pass.getBytes());
        System.out.println(encode);

        byte[] decode = Base64.getDecoder().decode(encode);
        System.out.println(new String(decode));
    }
}
