package ru.pp.pp_3_3_1springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.pp.pp_3_3_1springbootcrud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
