package com.planner.planner.participant;

import java.util.UUID;

public record ParticipantData(UUID id, String name, String email, boolean isConfirmed) {
}
