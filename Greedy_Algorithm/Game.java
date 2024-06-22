package Greedy_Algorithm;
// While playing an RPG game, you were assigned to complete one of the hardest quests in this game.
// There are n monsters you'll need to defeat in this quest. Each monster i is described with two integer 
// numbers - poweri and bonusi. To defeat this monster, you'll need at least poweri experience points. If 
// you try fighting this monster without having enough experience points, you lose immediately. You will 
// also gain bonusi experience points if you defeat this monster. You can defeat monsters in any order.
// The quest turned out to be very hard - you try to defeat the monsters but keep losing repeatedly. Your 
// friend told you that this quest is impossible to complete. Knowing that, you're interested, what is the 
// maximum possible number of monsters you can defeat? (Question difficulty level: Hardest)
// Input:
// The first line contains an integer, n, denoting the number of monsters.
// The next line contains an integer, e, denoting your initial experience.
// Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, poweri, which represents 
// power of the corresponding monster.
// Each line i of the n subsequent lines (where 0 ≤ i < n) contains an integer, bonusi, which represents 
// bonus for defeating the corresponding monster.




import java.util.*;

class Monster{
    int power;
    int bonus;

    public Monster(int power,int bonus){
        this.power=power;
        this.bonus=bonus;
    }

    public int getPower(){
        return power;
    }
   
    public int getBonus(){
        return bonus;
    }
  

}

public class Game{

    public static int findMaxCount(Monster[] monsters,int e){

        Arrays.sort(monsters,(m1,m2)->Integer.compare(m1.getPower(),m2.getPower()));
        int defeatcount=0;
        for(Monster monster:monsters){
            if(e>=monster.power){
                defeatcount++;

                e+=monster.bonus;
            }
            else{
                break;
            }
        }
        return defeatcount;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        Monster monsters[]=new Monster[n];
        int powers[]=new int[n];
        int bonuses[]=new int[n];
        for(int i=0;i<n;i++){
            powers[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            bonuses[i]=sc.nextInt();
        }
        sc.close();
        for(int j=0;j<n;j++){
            monsters[j]=new Monster(powers[j],bonuses[j]);
        }
        int result=findMaxCount(monsters,e);
        System.out.println(result);

    }


}