package Test;

public final class App {
    
    /** 
     * @return 
     */
    private App() {
    }

    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        RationalFraction f1 = new RationalFraction(1,7);
        RationalFraction f2 = new RationalFraction(1,6);
        RationalFraction f3 = new RationalFraction(1,5);
        RationalFraction f4 = new RationalFraction(1,4);
        RationalFraction f5 = new RationalFraction(1,3);
        RationalFraction f6 = new RationalFraction(2, 5);
        RationalFraction f7 = new RationalFraction(3, 7);
        SetOfFractions xxx = new SetOfFractions();
        SetOfFractions yyy = new SetOfFractions();
        xxx.add(f1);
        xxx.add(f2);
        yyy.add(f3);
        yyy.add(f4);
        yyy.add(f5);
        System.out.println("Set_1:");
        System.out.println(xxx.toString());
        System.out.println("Set_2:");
        System.out.println(yyy.toString());
        System.out.println("Polinom_1:");
        Polinom x = new Polinom(xxx);
        Polinom y = new Polinom(yyy);
        System.out.println(x.toString());
        System.out.println("Polinom_2:");
        System.out.println(y.toString());
        System.out.println("sum of polinoms:");
    }
}
