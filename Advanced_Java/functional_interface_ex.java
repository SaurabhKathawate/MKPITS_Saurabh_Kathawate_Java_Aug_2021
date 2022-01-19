
interface inf1{
    void disp();
}

class impl1 implements inf1{

    @Override
    public void disp() {
        System.out.println("hello");
    }
}

class functional_interface_ex{
    public static void main(String[] args) {
        inf1 ob= new impl1();
        ob.disp();
    }
}