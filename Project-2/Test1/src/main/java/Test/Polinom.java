package Test;

import java.util.ArrayList;

public class Polinom {
    private SetOfFractions list;

    Polinom(SetOfFractions a){
        list = a;
    }
    
    Polinom(ArrayList<RationalFraction> list){
        this.list = new SetOfFractions();
        for (RationalFraction i:list){
            this.list.add(i);
        }
    }
    Polinom(RationalFraction ... list){
        this.list = new SetOfFractions();
        for (RationalFraction i:list){
            this.list.add(i);
        }
    }

    @Override
    public String toString() {
        return "" + list;
    }

}
