package Parallel_Sorting;

import java.util.Arrays;

public class Parallel_Sort_ex_2 {
    public static void main(String[] args) {
        int numbers[] = {22,89,1,32,19,5};
        Arrays.parallelSort(numbers,1,4);
            for(int x:numbers){
                System.out.println(x);
            }
        }
    }
