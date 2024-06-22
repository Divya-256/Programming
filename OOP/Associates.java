package OOP;

import java.util.Scanner;

class EmployeeAsso{
    int id;
    String name;
    double score;
    int experience;
    public EmployeeAsso(int id,String name,double score,int experience){
        this.id=id;
        this.name=name;
        this.score=score;
        this.experience=experience;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getScore(){
        return score;
    }
    public int getExperience(){
        return experience;
    }


    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setScore(double score){
        this.score=score;
    }
    public void setExperience(int experience){
        this.experience=experience;
    }


}
public class Associates{

     static EmployeeAsso searchAssociateByScores(EmployeeAsso associates[],double score){
            for(int i=0;i<associates.length;i++){
                if(associates[i].getScore()==score){
                    return associates[i];
                }
            }
            return null;
    }
     static EmployeeAsso findAssociateWithMaxExperience(EmployeeAsso associates[]){
            int max=0;
            EmployeeAsso user=null;
            for(int i=0;i<associates.length;i++){
                if(associates[i].getExperience()>max){
                    max=associates[i].getExperience();
                    user=associates[i];
                }
            }
            return user;
    }
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the Number of Associates : ");
            int n=sc.nextInt();
            EmployeeAsso associates[]=new EmployeeAsso[n];
            System.out.println("Enter id,Name,score,experience(in months) of each associate");

            for(int i=0;i<n;i++){
                int id=sc.nextInt();
                sc.nextLine();
                String name=sc.nextLine();
                double score=sc.nextDouble();
                int experience=sc.nextInt();
                sc.nextLine();
                associates[i]=new EmployeeAsso(id,name,score,experience);
            }
        System.out.print("Enter the search Score : ");
        double score = sc.nextDouble();
        sc.close();
        EmployeeAsso user1=searchAssociateByScores(associates,score);

        if(user1==null){
            System.out.println("No Associate found with mentioned scores");
        }
        else{
            System.out.println("id : "+user1.getId()+"\n"+"Name : "+user1.getName());
        }

        EmployeeAsso user2 = findAssociateWithMaxExperience(associates);
        if(user2==null){
            System.out.println("No Associate found with experience");
        }
        else{
            System.out.println("id : "+user2.getId()+"\n"+"Name : "+user2.getName());
        }
    }
}