package andrei.teplyh.repository.workers;

import andrei.teplyh.entity.workers.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkersRepository extends JpaRepository<Worker, Long> {
}