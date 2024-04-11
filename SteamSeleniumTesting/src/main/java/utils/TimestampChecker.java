package utils;

import java.util.List;

public class TimestampChecker {

    public boolean isTimestampsDescending(List<String> timestamps) {
        for (int i = 0; i < timestamps.size() - 1; i++) {
            if (timestamps.get(i).compareTo(timestamps.get(i + 1)) < 0) {
                return false;
            }
        }
        return true;
    }
}
