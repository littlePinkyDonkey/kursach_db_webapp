package andrei.teplyh.entity.processes;

import andrei.teplyh.entity.pivot.Location;
import andrei.teplyh.entity.workers.Regisseur;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "location_description_process")
public class LocationDescriptionProcess extends Process {
    @Column(name = "PROCESS_ID")
    private int processId;

    @Column(name = "MAIN_PROCESS_ID")
    private int mainProcessId;

    @OneToMany(mappedBy = "descriptionProcess")
    private List<Location> locations = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "regisseur_location_process",
            joinColumns = @JoinColumn(name = "PROCESS_ID"),
            inverseJoinColumns = @JoinColumn(name = "WORKER_ID")
    )
    private List<Regisseur> workers = new ArrayList<>();

    public int getProcessId() {
        return processId;
    }
    public void setProcessId(int processId) {
        this.processId = processId;
    }

    @Override
    public int getMainProcessId() {
        return mainProcessId;
    }
    @Override
    public void setMainProcessId(int mainProcessId) {
        this.mainProcessId = mainProcessId;
    }

    public List<Location> getLocations() {
        return locations;
    }
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Regisseur> getWorkers() {
        return workers;
    }
    public void setWorkers(List<Regisseur> workers) {
        this.workers = workers;
    }
}
