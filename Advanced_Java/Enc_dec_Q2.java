import java.util.Base64;

class Enc_dec {
    byte[] encfun(String name) {
        byte[] encode= Base64.getEncoder().encode(name.getBytes());
        return encode;
    }
    String decfun(byte[] encodedata){
        byte[] decode= Base64.getDecoder().decode(encodedata);
        return new String(decode);
    }
}
public class Enc_dec_Q2 {
    public static void main(String[] args) {
        String pass="Saurabh@123";
        Enc_dec obj=new Enc_dec();
        byte[] encfun = obj.encfun(pass);
        String decfun = obj.decfun(encfun);
        System.out.println(decfun);
    }
}
