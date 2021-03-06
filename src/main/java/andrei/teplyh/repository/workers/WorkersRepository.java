package andrei.teplyh.repository.workers;

import andrei.teplyh.entity.workers.Worker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkersRepository extends JpaRepository<Worker, Integer> {
    @Procedure("add_worker")
    int addWorker(String name, String secondName, String gender, String placeOfBirth);

    @Procedure("delete_worker")
    boolean deleteWorker(int mainWorkerId);
}
