package exercise;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

// BEGIN
public class App {
    public static void save(Path path, Car car) throws IOException {
        String carCar = car.serialize();
        Files.writeString(path, carCar);
    }

    public static Car extract(Path path) throws IOException {
        String content = Files.readString(path);
        Car car = Car.unserialize(content);
        return car;
    }
}

// END
