package se331.lab.rest.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import se331.lab.rest.dao.EventDao;
import se331.lab.rest.entity.Event;
import se331.lab.rest.entity.EventDTO;
import se331.lab.rest.service.EventService;
import se331.lab.rest.util.LabMapper;

@Component
public class QueryQL implements GraphQLQueryResolver {
    String helloWorld() {
        return "hello world";
    }

    @Autowired
    EventService eventService;
    //EventDao eventDao;
    @Transactional
    EventDTO getEvent() {
        //return LabMapper.INSTANCE.getEventDto(eventDao.getEvent(1l));
        Event event = (eventService.getEvent(1l));
        return EventDTO.builder()
                .id(event.getId())
                .category(event.getCategory())
                .time(event.getTime())
                .title(event.getTitle())
                .description(event.getDescription())
                .build();
    }
}
