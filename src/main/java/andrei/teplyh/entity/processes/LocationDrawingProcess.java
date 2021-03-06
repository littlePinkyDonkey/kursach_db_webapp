package andrei.teplyh.entity.processes;

import andrei.teplyh.entity.pivot.Location;
import andrei.teplyh.entity.workers.Artist;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "location_drawing_process")
public class LocationDrawingProcess {
    @Id
    @Column(name = "PROCESS_ID")
    private int processId;

    @OneToOne
    @JoinColumn(name = "MAIN_PROCESS_ID")
    private Process process;

    @OneToMany(mappedBy = "drawingProcess")
    private List<Location> locations = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "artist_location_drawing_process",
            joinColumns = @JoinColumn(name = "PROCESS_ID"),
            inverseJoinColumns = @JoinColumn(name = "WORKER_ID")
    )
    private List<Artist> workers = new ArrayList<>();

    public int getProcessId() {
        return processId;
    }
    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public List<Location> getLocations() {
        return locations;
    }
    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public List<Artist> getWorkers() {
        return workers;
    }
    public void setWorkers(List<Artist> workers) {
        this.workers = workers;
    }
}
