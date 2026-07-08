import java.util.*;
public class Polindrome {
    public static void main(String[] args) {
        Scanner xyz=new Scanner(System.in);
        System.out.println("enter the number");
    int num=xyz.nextInt();

    int tem=num;
    int reverse=0;
    while(num!=0){
        int digit=num%10;
        reverse=reverse*10+digit;
        num=num/10;
    }
    if(reverse==tem)                                
        System.out.println("polindrom number");
    else
        System.out.println("not polindrome");
    
    }
    
}
