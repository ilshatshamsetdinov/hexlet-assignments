package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    private String tagBody;
    private List<Tag> tags;

    public PairedTag(String name, Map<String, String> atrubite, String tagBody, List<Tag> tags) {
        super(name, atrubite);
        this.tagBody = tagBody;
        this.tags = tags;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        for (Tag e: tags) {
            stringBuilder.append(e.toString());
        }
        stringBuilder.append(tagBody).append("</").append(super.name).append(">");
        return stringBuilder.toString();
    }
}
// END
