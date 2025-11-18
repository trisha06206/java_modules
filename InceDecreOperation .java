import java.util.*;
public class InceDecreOperation {
  public static void main(string[]args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number to perform Operation: ");
    int x=sc.nextInt();
    System.out.println(+x);
    System.out.println(-x);
    System.out.println(++x);
    System.out.println(x++);
    System.out.println(--x);
    System.out.print(x--);
    sc.close();
  }

}
