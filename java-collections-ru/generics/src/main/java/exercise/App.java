package exercise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
class App {

    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> resultList = new ArrayList<>();
        for (Map<String, String> l : books) {
            Map<String, String> m = new HashMap<>();
            for (Map.Entry<String, String> s : where.entrySet()) {
                if (l.containsValue(s.getValue()) && l.containsKey(s.getKey())) {
                    m.put(s.getKey(), s.getValue());
                    }
                }
            if (m.equals(where)) {
                resultList.add(l);
            }
        }
        return resultList;
    }
}
//END
