package by.dev.mastnail.manage.user.repository;

import by.dev.mastnail.manage.user.repository.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
