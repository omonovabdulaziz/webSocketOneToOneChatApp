package it.live.websocket.repository;

import it.live.websocket.entity.User;
import it.live.websocket.entity.enums.Status;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
