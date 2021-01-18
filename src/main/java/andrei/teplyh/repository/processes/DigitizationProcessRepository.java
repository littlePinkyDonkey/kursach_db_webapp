package andrei.teplyh.repository.processes;

import andrei.teplyh.entity.processes.DigitizationProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;

@Repository
public interface DigitizationProcessRepository extends JpaRepository<DigitizationProcess, Integer> {
    @Procedure("create_digitization_process")
    boolean createDigitizationProcess(int duration, Timestamp deadlineDate, String description, String status, Timestamp startDate,
                                      int sketchesNumber, String digitizationType);

    @Procedure("create_existing_digitization_process")
    boolean createExistingDigitizationProcess(int mainProcessId, int sketchesNumber, String digitizationType);

    @Procedure("delete_digitization_process")
    boolean deleteDigitizationProcess(int mainProcessId);
}
