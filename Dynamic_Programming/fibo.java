package Dynamic_Programming;

//to find the nth fibonacci number using dynamic programming recursion in this each recursion key value pair is stored
//as (n,fibonacci value) uisng hashmap,so if not present in hashmap only recursion takes place.this is in case of larger test cases,optimised solution.
//fibonacci series:- 0 1 1 2 3 5 8 13 21 ..
import java.util.*;

public class fibo {
    public static int fib(int n,HashMap<Integer,Integer> memo ){

        if(n==1 || n==2){
            return 1;
        }
        if(memo.containsKey(n)){
            return memo.get(n);
        }
        int result=fib(n-1,memo)+fib(n-2,memo);
        memo.put(n,result);
        return result;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=fib(n,new HashMap<>());
        System.out.println(ans);
    }
}
