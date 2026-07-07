import java.util.*;
public class EvenOdd {
    public static void main(String args[]){
        Scanner xyz=new Scanner(System.in);
        
        System.out.println("enter the number");
        int num=xyz.nextInt();
        
        if(num%2==0){
            System.out.println("the number is even"+num);
        }
            else{
                System.out.println("the number is Odd"+num);
            }
        }
}
