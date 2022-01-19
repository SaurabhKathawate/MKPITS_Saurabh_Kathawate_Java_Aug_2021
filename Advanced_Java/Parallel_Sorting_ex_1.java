package Parallel_Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Parallel_Sorting_ex_1 {
    public static void main(String[] args) {
        int numbers[] = {22,89,1,32,19,5};
        Arrays.parallelSort(numbers);
        for(int x:numbers){
            System.out.println(x);
        }
    }
}
