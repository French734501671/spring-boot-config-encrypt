package com.gz.configencrypt.dao;

import com.gz.configencrypt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author xiaozefeng
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
