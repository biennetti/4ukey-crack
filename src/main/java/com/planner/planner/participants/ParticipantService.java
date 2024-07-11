package com.planner.planner.participants;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ParticipantService {
    public void registerParticipantsToEvent(List<String> participantsToInvite, UUID id){}
    public void triggerConfirmationEmailToParticipants(UUID tripId) {}
}
