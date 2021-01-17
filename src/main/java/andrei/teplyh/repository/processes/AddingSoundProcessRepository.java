package andrei.teplyh.repository.processes;

import andrei.teplyh.entity.processes.AddingSoundProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface AddingSoundProcessRepository extends JpaRepository<AddingSoundProcess, Integer> {
    @Procedure("create_adding_sound_effect_process")
    boolean createAddingSoundEffectProcess(int duration, Date deadlineDate, String description, String status, Date startDate,
                                           String soundType);

    @Procedure("create_existing_adding_sound_effect_process")
    boolean createExistingAddingSoundEffectProcess(int mainProcessId, String soundType);

    @Procedure("delete_adding_sound_process")
    boolean deleteAddingSoundProcess(int mainProcessId);
}