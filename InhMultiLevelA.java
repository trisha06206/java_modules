class InhMultiLevelA {
  void showA() {
    System.out.println("This is class A");
  }
}
class InMultiLevelB extends InhMultiLevelA{
  void showB(){
    System.out.println("This is class B");
  }
}

class InhMultiLevelC extends InhMultiLevelB{
  void showC() {
    System.out.println("This is class C");
  }
}
public class InhMultiLevel {
  public static void main(string[]args) {
    InhMultiLevelC obj = new InhMultiLevelC();
    obj.showA();
    obj.showB();
    obj.showC();
  }
}

  
