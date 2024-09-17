import java.util.Scanner;
class BillCounter{
       static int Bill=0;
       static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        
        System.out.println("~~~Welcome To Java Restaurant~~~");
        char orderMore;
        do { 
            showMenu();
            System.out.println("Pleasse Select The Item:");
            int n=sc.nextInt();
            if(n==1) one(sc);
            else if(n==2) two(sc);
            else if(n==3) three(sc);
            else System.out.println("Inavalid Option,Please Select Again Correctly");
            System.out.println("Do You Want To Order Something Else?(y/Y or Press Any Key)");
            orderMore=sc.next().charAt(0);
           } while (orderMore=='y' || orderMore=='Y');
           System.out.println("Your Total Bill Is:"+Bill);
            System.err.println("Thank You Hava A Good Day");
}
public  static void showMenu(){
    System.err.println("Menu");
    System.out.println("1.One");
    System.err.println("2.Two");
    System.out.println("3.Three");
}
public static void one(Scanner sc){
    System.out.print("How Many One Plates Do You Want To Order?");
    int m=sc.nextInt();
    Bill+=m*10;
    
    System.out.println("Your Total Bill Upto Now Is:"+Bill);
}
public static void two(Scanner sc){
    System.out.print("How Many Two Plates Do You Want To Order?");
    int m=sc.nextInt();
    Bill+=m*20;
    
    System.out.println("Your Total Bill Upto Now Is:"+Bill);
}
public static void three(Scanner sc){
    System.out.print("How Many Three Plates Do You Want To Order?");
    int m=sc.nextInt();
    Bill+=m*30;
    
    System.out.println("Your Total Bill Upto Now Is:"+Bill);
}
}

