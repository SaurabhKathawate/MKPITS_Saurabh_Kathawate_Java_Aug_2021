import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Q2 {
    public static void main(String[] args) {
        ArrayList<Integer> ob=new ArrayList<Integer>();
        ArrayList<Integer> ob2=new ArrayList<Integer>();
        ob.add(10);
        ob.add(15);
        ob.add(20);
        ob.add(25);
        ob.add(30);
        System.out.println(ob);
//        for(Integer integer : ob)
//        {
//            if(integer % 2==0)
//            {
//                ob2.add(integer);
//            }
//        }
//        System.out.println(ob2);
        List<Integer> collect =ob.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());
    }
}
