import java.util.Scanner;
public class Calculate {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int a,b;
      a=sc.nextInt();
      b=sc.nextInt();
      int add = a+b;
      int sub = a-b;
      int mul = a*b;
      int div = a/b;
      
      System.out.println(add);
       System.out.println(sub);
        System.out.println(mul);
         System.out.println(div);
    }
}