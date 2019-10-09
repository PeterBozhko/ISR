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
    public int hashCode() {
        int result = 1;
        for (int i = 0; i < list.list.size(); i++){
            result = result + list.list.get(i).hashCode();
        };
        return result;
    }

}
