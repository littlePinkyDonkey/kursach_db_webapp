package andrei.teplyh.repository;

import andrei.teplyh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Procedure("delete_user")
    boolean deleteUser(int mainWorkerId);
}
