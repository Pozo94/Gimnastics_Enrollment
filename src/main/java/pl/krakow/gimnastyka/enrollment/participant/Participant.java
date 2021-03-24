package pl.krakow.gimnastyka.enrollment.participant;

import pl.krakow.gimnastyka.enrollment.group.Group;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Participant {
    private final UUID participantID;
    private final String firstName;
    private final String lastName;
    private final Date bday;
    private final String email;
    private final String phoneNumber;
    private final Location location;
    enum Location{
        AWF,
        ZIELONKI
    }

    List<Group> grpups;


    public Participant(UUID participantID, String firstName, String lastName, Date bday, String email, String phoneNumber, Location location, List<Group> grpups) {
        this.participantID = participantID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.bday = bday;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
        this.grpups = grpups;
    }

    public UUID getParticipantID() {
        return participantID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBday() {
        return bday;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Location getLocation() {
        return location;
    }

    public List<Group> getGrpups() {
        return grpups;
    }
}
