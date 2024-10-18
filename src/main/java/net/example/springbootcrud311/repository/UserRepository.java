package net.example.springbootcrud311.repository;

import net.example.springbootcrud311.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
