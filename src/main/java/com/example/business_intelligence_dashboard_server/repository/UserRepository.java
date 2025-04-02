package com.example.business_intelligence_dashboard_server.repository;

import com.example.business_intelligence_dashboard_server.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
