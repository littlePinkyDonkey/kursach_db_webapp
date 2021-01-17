package andrei.teplyh.repository.processes;

import andrei.teplyh.entity.processes.CharacterSelectProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface CharacterSelectProcessRepository extends JpaRepository<CharacterSelectProcess, Integer> {
    @Procedure("create_character_select_process")
    boolean createCharacterSelectprocess(int duration, Date deadlineDate, String description, String status, Date startDate);

    @Procedure("create_existing_character_select_process")
    boolean createExistingCharacterSelectprocess(int mainProcessId);

    @Procedure("delete_character_select_process")
    boolean deleteCharacterSelectProcess(int mainProcessId);
}