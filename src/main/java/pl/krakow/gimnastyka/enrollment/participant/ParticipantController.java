package pl.krakow.gimnastyka.enrollment.participant;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.UUID;
@RestController
@RequestMapping("participants")
public class ParticipantController {
    @GetMapping
    public List<Participant> getAllParticipants(){
        return List.of(new Participant(
                UUID.randomUUID(),
                "Jacek",
                "Pozowski",
                new Date(System.currentTimeMillis()),
                "jacekpozo@gmail.com",
                "668324888",
                Participant.Location.AWF,
                null),new Participant(
                UUID.randomUUID(),
                "Ola",
                "Biskup",
                new Date(System.currentTimeMillis()),
                "olagim1@gmail.com",
                "660324888",
                Participant.Location.ZIELONKI,
                null));
    }
}

