package com.trenc.rest.repos;

import com.trenc.rest.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Long> {
}
