import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Q4 {
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
//            ob2.add(integer+5);
//        }
//        System.out.println(ob2);
        List<Integer> collect=ob.stream().map(e -> e + 5).collect(Collectors.toList());
        System.out.println(collect);
    }
}
