package Test;
import java.util.ArrayList;

public class SetOfFractions {
    protected ArrayList<RationalFraction> list = new ArrayList<>();
    private RationalFraction MaxEl, MinEl;
    //private boolean isChange = false;

    SetOfFractions(RationalFraction ... list){
        for (RationalFraction i:list){
            this.add(i);
        }
    }
    public void add(RationalFraction a){
        list.add(a);
        //isChange = true;
        if (MaxEl != null){
            if (a.rationalcmp(MaxEl) == 1){
                MaxEl = a;
            }
        }
        else {
            MaxEl = a;
        }

        if (MinEl != null){
            if (a.rationalcmp(MinEl) == -1){
                MaxEl = a;
            }
        }
        else {
            MinEl = a;
        }
    }
    public RationalFraction getMaxEl(){
        return MaxEl;
    }
    public RationalFraction getMinEl(){
        return MinEl;
    }

    SetOfFractions(ArrayList<RationalFraction> list){
        for (RationalFraction i:list){
            this.add(i);
        }
    }

    @Override
    public String toString() {
        return "" + list;
    }
}
