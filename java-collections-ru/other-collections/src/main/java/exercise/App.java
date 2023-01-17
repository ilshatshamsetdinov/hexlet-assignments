package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
class App {
    public static Map<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        Set<String> keySet = new TreeSet<>();
        keySet.addAll(data1.keySet());
        keySet.addAll(data2.keySet());
        for(String k: keySet) {
            if (!data1.containsKey(k) && data2.containsKey(k)) {
                linkedHashMap.put(k, "added");
            } else if (data1.containsKey(k) && !data2.containsKey(k)) {
                linkedHashMap.put(k, "deleted");
            } else if (data1.containsKey(k) && data2.containsKey(k) && !data1.get(k).equals(data2.get(k))) {
                linkedHashMap.put(k, "changed");
            } else if (data1.containsKey(k) && data2.containsKey(k) && data1.get(k).equals(data2.get(k))) {
                linkedHashMap.put(k, "unchanged");
            }
        }
        return linkedHashMap;

    }

}


//END
