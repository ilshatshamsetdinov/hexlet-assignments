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
        return super.toString() + tagBody + "</" + super.name + ">";
    }
}
// END
