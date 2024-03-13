package DemoInheritanceAddMethod;

public class Sub extends Add {
        private int c;
        private int d;


    public Sub(int a, int b, int c, int d) {
        super(a, b);
        this.c = c;
        this.d = d;
    }
    public int subb(){
        super.add();
        int subTotal = c-d-getA()-getB();
        System.out.println(subTotal);
        return subTotal;
    }



    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }
}
