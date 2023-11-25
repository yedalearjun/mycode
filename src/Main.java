import java.util.Scanner;
 class scanner {
    public  static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st number");
        int var1=sc.nextInt();
        System.out.println("enter secound num");
        int var2=sc.nextInt();

        System.out.println("enter 1 for addition");
        System.out.println("enter 2 for subtraction");
        System.out.println("enter 3 for multiplication");
        System.out.println("enter 4 for division");
        System.out.println("enter value 0f n");
        System.out.println("enter value 0f n");
        int n=sc.nextInt();

        if (n==1){
            System.out.println(var1+var2);
        }
        else if(n==2){
            System.out.println(var1-var2);
        }
        else if(n==3){
            System.out.println(var1*var2);
        }
        else if(n==4){
            System.out.println(var1/var2);
        }
        else
        System.out.println("enter proper value of n");


    }
}