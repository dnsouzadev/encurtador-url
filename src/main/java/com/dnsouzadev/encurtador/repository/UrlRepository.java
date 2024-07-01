package com.dnsouzadev.encurtador.repository;

import com.dnsouzadev.encurtador.entities.UrlEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UrlRepository extends MongoRepository<UrlEntity, String> {
}
