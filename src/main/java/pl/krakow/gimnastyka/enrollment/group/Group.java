package pl.krakow.gimnastyka.enrollment.group;

import java.sql.Time;
import java.util.UUID;

public class Group {
    private final UUID groupID;
    private final String day;
    private final Time hour;
    private final int cap;

    public Group(UUID groupID, String day, Time hour, int cap) {
        this.groupID = groupID;
        this.day = day;
        this.hour = hour;
        this.cap = cap;
    }

    public UUID getGroupID() {
        return groupID;
    }

    public String getDay() {
        return day;
    }

    public Time getHour() {
        return hour;
    }

    public int getCap() {
        return cap;
    }
}
