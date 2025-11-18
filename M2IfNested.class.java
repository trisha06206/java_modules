public class OuterClass {
    private int outerValue = 10;
    public String outerMessage = "Hello from OuterClass!";

    // Inner class (non-static member class)
    class InnerClass {
        public void displayOuterMembers() {
            // Inner class can directly access all members of the outer class,
            // including private ones.
            System.out.println("Outer Value: " + outerValue);
            System.out.println("Outer Message: " + outerMessage);
        }
    }

    public void createAndUseInner() {
        InnerClass inner = new InnerClass(); // Create an instance of the inner class
        inner.displayOuterMembers();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createAndUseInner();

        // Alternatively, you can create an inner class instance directly from main
        // OuterClass.InnerClass directInner = outer.new InnerClass();
        // directInner.displayOuterMembers();
    }
}
