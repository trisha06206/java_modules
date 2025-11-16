import java.util.*;

class Array_2{
public static void main(string[]args){
  scanner sc=new scanner(system.in);
  System.out.println("enter the number of element:");
  int n=sc.nextInt();
  int a[]=new int[n];

  System.out.println("enter the number:");
  for (int i=0;i<n;i++){
    a[i]=sc.nrxtInt();
  }
  int sum=0;
  for(int i=0;i<n;i++){
    sum+=a[i];
  }
  float average =(sum/n);

  System.out.println("The sum of array is:"+sum);
  System.out.println("Average of the given array is:"average);
}
}
  
