interface InHyabridA {
  void methodA();
}
interface InHybridB implements InHybridA{
  void methodB();
}

class InHybridC implements InHybridB{
  public void methodA(){
    System.out.println("Method A from interface A");
  }
  public void methodB(){
    System.out.println("Method B from interface B");
  }
}
public class InHybrid{
  public static void main(string[]args){
    InHybridC obj = new InHybridC();
    obj.methodA();
    obj.methodB();
  }
}
  
