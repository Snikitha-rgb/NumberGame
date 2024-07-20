import java.util.*;
public class NumberGame
{
    public static void main(String[] args) {
     try{
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        int randomNumber = random.nextInt(100) + 1;
         System.out.println("Guess any number between 1 to 100: ");
         int num=sc.nextInt();
         
        int i;
        for( i=0;i<3;i++)
        {
             
            if(num==randomNumber)
            {
             System.out.println("Correct Answer! ");
             break;
            }
            else if(num>randomNumber)
            {
             System.out.println("oh your number is High");
             System.out.println("\nyou can try once again to guess the number!");
             num=sc.nextInt();
            }
            else
            {
             System.out.println("oh your number is low");
             System.out.println("\nyou can try once again to guess the number!");
             num=sc.nextInt();
            }
             
        }
        if(i==2)
        {
            System.out.println("played well! your score is 30 out of 100");
        }
        else if(i==0)
        {
            System.out.println("Congratulations! your score is 100");
        }
        else if(i==1)
        {
            System.out.println("Very Good! your score is 50 out of 100");
        }
        else if(i==3){
             
            System.out.println("oh you lost the game the number was: "+randomNumber);
        }
     }catch(Exception e)
     {
         System.out.println("Got Exception: "+e);
     }
    }
}
