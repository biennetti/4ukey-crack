package com.planner.planner.link;

import com.planner.planner.trip.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class LinkService {
    @Autowired
    private LinkRepository repository;

    public LinkResponse registerLink(LinkRequestPayload payload, Trip trip) {

        Link newLink = new Link(payload.title(), payload.url(), trip);

        this.repository.save(newLink);
        return new LinkResponse(newLink.getId());
    }

    public List<LinkData> getAllLinksFromId(UUID tripId) {
        return this.repository.findByTripId(tripId).stream().map(link -> new LinkData(link.getId(), link.getTitle(), link.getUrl())).toList();
    }
}
