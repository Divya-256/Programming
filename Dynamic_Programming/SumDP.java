package Dynamic_Programming;
//given a value ,and an array .check if the elements in the array (repeatations allowed) can be summed to get the input value.

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SumDP {
    public static boolean checkSum(int value,List<Integer>arr){
        if(value==0){
            return true;
        }
        if(value<0){
            return false;
        }
        for(int num:arr){
            int nextval=value-num;
            if(checkSum(nextval, arr)){
                return true;
            }
            
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value to be checked\n");
        int value=sc.nextInt();
        System.out.println("enter the size of the array\n");
        int size_of_array=sc.nextInt();
        System.out.println("add elements to the list\n");
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<size_of_array;i++){
            arr.add(sc.nextInt());
        }
        sc.close();
        boolean result=checkSum(value,arr);
        System.out.println("ans is: "+ result);
    }
}
