package com.gary.cr.exampledorian.repositories;

import com.gary.cr.exampledorian.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
