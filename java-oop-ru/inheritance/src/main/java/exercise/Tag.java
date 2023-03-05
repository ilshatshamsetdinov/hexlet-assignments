package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
public class Tag {
    protected String name;
    protected Map<String, String> atrubites;

    public Tag(String name, Map<String, String> atrubite) {
        this.name = name;
        this.atrubites = atrubite;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("<" + name);
        for (Map.Entry<String, String> atribute: atrubites.entrySet()) {
             stringBuilder.append(" " + atribute.getKey()).append("=").append("\"").append(atribute.getValue()).append("\"");
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
// END
