package transport;

import java.time.LocalTime;

public interface Competing {
    void pitStop();
    double maxSpeed();
    LocalTime bestTime();
}