package azex;
import java.util.Scanner;
public class Azex {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.next();
        System.out.println("Welcame "+name+" in my cal");
        System.out.println("------------------------------------");
        opreation();
        while (true){
            System.out.println("Enter Opreation : ");
            char op=input.next().charAt(0);
            switch(op){
                case '+':
                    sum();
                    break;
                case '-':
                    sub();
                    break;
                case '/':
                    div();
                    break;
                case '*':
                    mul();
                    break;
                case 'a':
                    abs();
                    break;
                case '!':
                    fact();
                    break;
                case 's':
                    sqrt();
                    break;
                case '%':
                    mol();
                    break;
                case '^':
                    power();
                    break;
                case 'e':
                    break;
        }
           System.out.println("Enter E to end");  
            System.out.println("Enter any char to continue");
            char h=input.next().charAt(0);
            if(h=='E') {
                 System.out.println("Thank you very much !");
                break;}
        }
        

    }
    public static void opreation(){
        System.out.println("Calculator Opreration ");
        System.out.println("+ to plus");
        System.out.println("- to minus ");
        System.out.println("* to mutiple");
        System.out.println("/ to div");
        System.out.println("% to module ");
        System.out.println("^ to power");
        System.out.println("! to fact");
        System.out.println("a to abs");
        System.out.println("s to sqrt");
        System.out.println("e to exit");
    
}
    public static double scan(int n){
        Scanner input=new Scanner(System.in);
        if(n==0)
            System.out.println("Enter the number");
        else System.out.println("Enter your number "+n);
            
            double x=input.nextDouble();
            return x;
    }
     public static void sum(){
         double x=scan(0); double sum=0;
         for(int i=1;i<=x;i++){
             double y=scan(i);
             
             sum+=y;
             
         }
         System.out.println("sum = "+sum);
     }
    
     public static void sub(){
         double x=scan(0); double sub=0;
         for(int i=1;i<=x;i++){
             double y=scan(i);
             
             sub-=y;
             
         }
         System.out.println("sub  = "+sub);
     }
     public static void div(){
         double x=scan(0); double div=1;
         for(int i=1;i<=x;i++){
             double y=scan(i);
             if (y!=0)
             div/=y;
             else  System.out.println("the number error ");
             
         }
         System.out.println("div = "+div);
     }
     public static void mul(){
         double x=scan(0); double mul=1;
         for(int i=1;i<=x;i++){
             double y=scan(i);
             
             mul*=y;
             
         }
         System.out.println("multplue = "+mul);
     }
     
        public static void abs(){
             int x=(int)scan(0);
             if (x<0){
                 x=x*-1;
                System.out.println("|"+x+"| ="+x); 
             }
             else  System.out.println("|"+x+"| ="+x); 
            
        }
          public static void fact(){
              int x=(int)scan(0);
              if(x>0){
                  int ans=1;
                  for(int i=1;i<=x;i++)
                      ans*=i;
                    System.out.println(x+"! ="+ans);  
              }
              else System.out.println(" no fact for this number");  
                  
              
          }
         public static void sqrt(){
              int x=(int)scan(0);
              int z=0;
              for(int i=1;i<x;i++)
                  if(i*i==x){
                     System.out.println("sqrt "+x+" = "+i);
                     z=1;
                     break;
                   
                  }
              if(z==0) System.out.println("no root");  
               }
         public static void mol(){
             int x=(int)scan(1);
             int y=(int)scan(2);
             if(y!=0){
                 int mod=x%y;
                 
             System.out.println(" mod = "+ mod); } 
             else  System.out.println("invalid number");  
                 
         }
         public static void power(){
             int x=(int)scan(1);
             int y=(int)scan(2); int pow=1;
             if (y==0)   System.out.println(" power = "+ 1);
             else{
             for(int i=1;i<=y;i++)
                 pow*=x;
                 System.out.println(" power = "+ pow);}
                 
         }
         
        
}
