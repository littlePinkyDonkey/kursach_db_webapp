package andrei.teplyh.entity.processes;

import andrei.teplyh.entity.workers.StoryboardArtist;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "storyboard_process")
public class StoryboardProcess {
    @Id
    @Column(name = "PROCESS_ID")
    private int processId;

    @OneToOne
    @JoinColumn(name = "MAIN_PROCESS_ID")
    private Process process;

    @Column(name = "FRAME_NUMBER")
    private int frameNumber;

    @ManyToMany
    @JoinTable(
            name = "artist_storyboard_process",
            joinColumns = @JoinColumn(name = "PROCESS_ID"),
            inverseJoinColumns = @JoinColumn(name = "WORKER_ID")
    )
    private List<StoryboardArtist> artists = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "revision_storyboarding",
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

    public int getFrameNumber() {
        return frameNumber;
    }
    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public List<StoryboardArtist> getArtists() {
        return artists;
    }
    public void setArtists(List<StoryboardArtist> artists) {
        this.artists = artists;
    }

    public List<RevisionsProcess> getRevisionsProcesses() {
        return revisionsProcesses;
    }
    public void setRevisionsProcesses(List<RevisionsProcess> revisionsProcesses) {
        this.revisionsProcesses = revisionsProcesses;
    }
}
