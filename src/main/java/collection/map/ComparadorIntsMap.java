package collection.map;

import java.util.Comparator;
import java.util.Map;

public class ComparadorIntsMap implements Comparator<Integer> {

    Map<Integer, String> base;

    public ComparadorIntsMap(Map<Integer, String> base) {
        this.base = base;
    }

    @Override
    public int compare(Integer integer1, Integer integer2) {
        return base.get(integer1).compareTo(base.get(integer2));
    }
}
