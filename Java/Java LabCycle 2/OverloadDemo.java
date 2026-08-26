class Display {
    void display(int x) {
        System.out.println("Integer : " + x);
    }
    void display(double y) {
        System.out.println("Double : " + y);
    }
    void display(String s) {
        System.out.println("String : " + s);
    }
}

public class OverloadDemo {
    public static void main(String[] args) {
        Display d = new Display();
        d.display(10);
        d.display(25.6);
        d.display("Java");
    }
}
