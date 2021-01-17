package andrei.teplyh.repository.workers;

import andrei.teplyh.entity.workers.SmoothingSpecialist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface SmoothingSpecialistRepository extends JpaRepository<SmoothingSpecialist, Integer> {
    @Procedure("add_smoothing_specialist")
    boolean addSmoothingSpecialist(String name, String secondName, String gender, int age, String placeOfBirth);

    @Procedure("add_existing_smoothing_specialist")
    boolean addExistingSmoothingSpecialist(int mainWorkerId);

    @Procedure("delete_smoothing_specialist")
    boolean deleteSmoothingSpecialist(int mainWorkerId);
}
