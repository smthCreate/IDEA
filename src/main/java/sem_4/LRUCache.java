package sem_4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class LRUCache<T> {
    private ArrayList<T> list;
    private Integer size;

    public LRUCache(Integer size) {
        this.size = size;
        this.list = new ArrayList<>();
    }
    public void addEl(T el){
        if (this.list.size()<size){
            this.list.add(el);
        } else{
            this.list.remove(0);
            this.list.add(el);
        }
    }

    public T getEl(Integer pos){
        if (pos<list.size()&&pos>-1){
            return list.get(pos);
        } else{
            System.out.println("No element");
            return null;
        }
    }
    public List<T> getAllEl(){
        return list;
    }
}
