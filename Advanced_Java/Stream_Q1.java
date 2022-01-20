import java.util.ArrayList;

public class Stream_Q1 {
    public static void main(String[] args) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        ArrayList<Integer> ob2=new ArrayList<Integer>();
        ob.add(10);
        ob.add(15);
        ob.add(20);
        ob.add(25);
        ob.add(30);
        System.out.println(ob);
        for(Integer integer : ob)
        {
            if(integer % 2==0)
            {
                ob2.add(integer);
            }
        }
        System.out.println(ob2);
    }
}
