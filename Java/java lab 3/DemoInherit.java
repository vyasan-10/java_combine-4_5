class Base {
    private int i;

    public void seti(int a) {
        i = a;
        System.out.println("value of i is set to " + i);
    }

    public int geti() {
        System.out.println("the current value of i is " + i + " and it is returned");
        return i;
    }

    @Override
    protected void finalize() {
        System.out.println("Garbage Collected");
    }
}

class Derived extends Base {
    private int j;

    public void setj(int a) {
        j = a;
        System.out.println("value of j is set to " + j);
    }

    public int getj() {
        System.out.println("the current value of j is " + j + " and it is returned");
        return j;
    }
}

public class DemoInherit {
    public static void main(String[] args) {
        // Step 1: Working with base class object
        System.out.println("working with base class object");
        Base objB = new Base();
        objB.seti(10);
        System.out.println("the current value of i is received in main as -> " + objB.geti());

        // Step 2: Optional experiment with garbage collection
        // objB = null; // Uncomment to make objB eligible for GC
        System.gc(); // Request garbage collection

        // Step 3: Working with derived class object (inherited methods)
        System.out.println("\nworking with derived class object");
        Derived objD = new Derived();
        objD.seti(20); // inherited from Base
        System.out.println("the current value of i is received in main as -> " + objD.geti());

        // Step 4: Working with derived class object (own methods)
        objD.setj(30);
        int k = objD.getj();
        System.out.println("the current value of j is received in main as -> " + objD.getj() + k);
    }
}
