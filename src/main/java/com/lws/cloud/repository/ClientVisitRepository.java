package com.lws.cloud.repository;

import com.lws.cloud.model.ClientVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientVisitRepository extends JpaRepository<ClientVisit, Integer> {
}
