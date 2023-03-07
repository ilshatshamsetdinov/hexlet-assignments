package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Address address) {
        try {
            List<String> result = new ArrayList<>();
            Field[] fields = address.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if (field.get(address) == null && field.isAnnotationPresent(NotNull.class)) {
                    result.add(field.getName());
                }
            }
            return result;
        } catch (IllegalAccessException e) {
            throw new RuntimeException();
        }
    }
}
// END
