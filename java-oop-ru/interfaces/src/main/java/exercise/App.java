package exercise;
import java.util.List;
import java.util.stream.Collectors;


// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> homeList, int n) {
        return homeList.stream()
                .sorted(Home::compareTo)
                .map(Home::toString)
                .limit(n)
                .collect(Collectors.toList());
    }
}
// END
