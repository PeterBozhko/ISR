package Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
    SetOfFractions(String filename){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line = reader.readLine();
            while (line != null) {
                this.add(parser(line));
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e){
        }
    }
    
    private RationalFraction parser(String line){
        String arr[] = line.split("/");
        int num = Integer.parseInt(arr[0]);
        int den = Integer.parseInt(arr[0]);
        return new RationalFraction(num, den);
    }

    public void add(RationalFraction a) {
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
