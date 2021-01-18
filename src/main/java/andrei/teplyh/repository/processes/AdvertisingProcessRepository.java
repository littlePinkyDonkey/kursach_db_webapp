package andrei.teplyh.repository.processes;

import andrei.teplyh.entity.processes.AdvertisingProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface AdvertisingProcessRepository extends JpaRepository<AdvertisingProcess, Integer> {
    @Procedure("create_advertising_process")
    boolean createAdvertisingProcess(int duration, Timestamp deadlineDate, String description, String status, Timestamp startDate,
                                     String insertionLocation);

    @Procedure("create_existing_advertising_process")
    boolean createExistingAdvertisingProcess(int mainProcessId, String insertionLocation);

    @Procedure("delete_advertising_process")
    boolean deleteAdvertisingProcess(int mainProcessId);
}
