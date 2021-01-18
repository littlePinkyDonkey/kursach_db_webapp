package andrei.teplyh.repository.pivot;

import andrei.teplyh.entity.pivot.Plot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.stereotype.Repository;

@Repository
public interface PlotRepository extends JpaRepository<Plot, Integer> {
    @Procedure("create_plot")
    boolean createPlot(int processId, int pageNumbers, String plotType, String description, String plotName);

    @Procedure("delete_plot")
    boolean deletePlot(int plotId);
}