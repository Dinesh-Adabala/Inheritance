package DemoInheritanceAddMethod;

public class Add {
    public int a;
    private int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int add(){
        int addTotal = a+b;
        System.out.println(addTotal);
        return addTotal;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
