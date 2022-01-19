
interface inf2{
    void disp();
}

/*class impl2 implements inf2{

    @Override
    public void disp() {
        //System.out.println("hello");
    }
}*/

class functional_interface_using_lambda_ex{
    public static void main(String[] args) {
        inf2 ob= () -> System.out.println("welcome");
        ob.disp();
    }
}
