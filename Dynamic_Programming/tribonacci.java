package Dynamic_Programming;

//to get value from 0 0 1 1 2 4 7 13 24 ..
import java.util.HashMap;
import java.util.Scanner;

public class tribonacci {

    public static int trib(int n,HashMap<Integer,Integer> hash){
        if(n<=2){
            return 0;
        }
        else if(n==3 || n==4){
            return 1;
        }
        else if(hash.containsKey(n)){
            return hash.get(n);
        }

        int result=trib(n-1,hash)+trib(n-2,hash)+trib(n-3,hash);
        hash.put(n,result);
        return result;



    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=trib(n,new HashMap<>());
        System.out.println(ans);
    }
}
