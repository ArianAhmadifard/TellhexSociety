package com.TellhexSociety.Api.Repository;

import com.TellhexSociety.Api.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
