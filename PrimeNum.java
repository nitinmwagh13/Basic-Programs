
//prime number is only devide itself and 1;
// 
public class PrimeNum {
    public static void main(String[] args) {
        int num=13;
        //int count =0;
boolean prime=true;
for(int i=2;i<num;i++){
if(num%i==0){
prime=false;
break;
}
}
if(prime){
System.out.println("prime number");
    }
else{
    System.out.println("not prime number");
}
    }
}


// for(int i=1;i<=num;i++){
//     if(num%i==0){
//         count++;
//     }
// }
// if(count==2){
//     System.out.println("prime number");
// }
// else{
//     System.out.println("not prime number");
// }
    

