package OOP.Package1;

public class InnerOut {
    private int a = 5;

    public InnerOut(int a ){
        this.a = a;
    }

    class Inner{
        int a = 10;
        public void doSmth(int a){
            System.out.println("a from parametrs "+ a);
            System.out.println("a from Inner"+ this.a);
            System.out.println("a from Outer"+InnerOut.this.a);
        }
    }

}

//inMain -
//    InnerOut outer = new InnerOut(5);
//    InnerOut.Inner inner = outer.new Inner();

//    System.out.println(inner.a);
//    inner.doSmth(100);
//executed:
//        10
//        a from parametrs 100
//        a from Inner10
//        a from Outer5
