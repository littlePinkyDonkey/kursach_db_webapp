package andrei.teplyh.entity.processes;

import andrei.teplyh.entity.workers.SmoothingSpecialist;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "smoothing_process")
public class SmoothingProcess {
    @Id
    @Column(name = "PROCESS_ID")
    private int processId;

    @OneToOne
    @JoinColumn(name = "MAIN_PROCESS_ID")
    private Process process;

    @ManyToMany
    @JoinTable(
            name = "smoother_smoothing_process",
            joinColumns = @JoinColumn(name = "PROCESS_ID"),
            inverseJoinColumns = @JoinColumn(name = "WORKER_ID")
    )
    private List<SmoothingSpecialist> workers = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "revision_smoothing",
            joinColumns = @JoinColumn(name = "PROCESS_ID"),
            inverseJoinColumns = @JoinColumn(name = "REVISION_ID")
    )
    private List<RevisionsProcess> revisionsProcesses = new ArrayList<>();

    public int getProcessId() {
        return processId;
    }
    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public List<SmoothingSpecialist> getWorkers() {
        return workers;
    }
    public void setWorkers(List<SmoothingSpecialist> workers) {
        this.workers = workers;
    }

    public List<RevisionsProcess> getRevisionsProcesses() {
        return revisionsProcesses;
    }
    public void setRevisionsProcesses(List<RevisionsProcess> revisionsProcesses) {
        this.revisionsProcesses = revisionsProcesses;
    }
}
