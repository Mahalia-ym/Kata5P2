package kata5parte2.model;

import java.util.HashMap;
import java.util.Set;
import static javafx.scene.input.KeyCode.T;

public class Histogram {
    private final HashMap<T, Integer> map = new HashMap<>();
    
    public int get (T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T key){
        map.put(key, map.containsKey(key) ? map.get(key)+1 : 1);
    }
    
    
}
