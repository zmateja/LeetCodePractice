package Medium;

import java.util.ArrayList;
import java.util.HashSet;


public class RandomizedSet {
    private ArrayList<Integer> keys;
    private HashSet<Integer> values;

    public RandomizedSet(){
        keys = new ArrayList<>();
        values = new HashSet<>();
    }

    public boolean insert(Integer val){
        boolean returnVal = values.add(val);
        if(returnVal)
            keys.add(val);
        return returnVal;
    }

    public boolean remove(Integer val){
        boolean returnVal = values.remove(val);
        if(returnVal)
            keys.remove(val);
        return returnVal;
    }

    public int getRandom(){
        int index = (int) (Math.random() * keys.size());
        return keys.get(index);
    }
}
