package andrei.teplyh.repository.processes;

import andrei.teplyh.entity.processes.BattleDescriptionProcess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface BattleDescriptionProcessRepository extends JpaRepository<BattleDescriptionProcess, Integer> {
    @Procedure("create_battle_description_process")
    boolean createBattleDescriptionProcess(int duration, Date deadlineDate, String description, String status, Date startDate);

    @Procedure("create_existing_battle_description_process")
    boolean createBattleDescriptionProcess(int mainProcessId);

    @Procedure("delete_battle_description_process")
    boolean deleteBattleDescriptionProcess(int mainProcessId);
}
