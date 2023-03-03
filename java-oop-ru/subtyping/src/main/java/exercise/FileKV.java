package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements KeyValueStorage{
    String filepath;
    Map<String, String> map;

    public FileKV(String filepath, Map<String, String> map) {
        this.filepath = filepath;
        this.map = new HashMap<>(map);
    }

    @Override
    public void set(String key, String value) {
        toMap().put(key, value);
        String json = Utils.serialize(toMap());
        Utils.writeFile(filepath, json);
    }

    @Override
    public void unset(String key) {
        toMap().remove(key);
        String json = Utils.serialize(toMap());
        Utils.writeFile(filepath, json);
    }

    @Override
    public String get(String key, String defaultValue) {
        String path = Utils.readFile(filepath);
        Map<String, String> newMap = Utils.unserialize(path);
        return newMap.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        String path = Utils.readFile(filepath);
        Map<String, String> newMap = Utils.unserialize(path);
        return new HashMap<>(newMap);
    }
}
// END
