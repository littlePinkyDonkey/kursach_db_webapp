package andrei.teplyh.entity.processes;

import andrei.teplyh.entity.pivot.Character;
import andrei.teplyh.entity.workers.Editor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "character_select_process")
public class CharacterSelectProcess {
    @Id
    @Column(name = "PROCESS_ID")
    private int processId;

    @OneToOne
    @JoinColumn(name = "MAIN_PROCESS_ID")
    private Process process;

    @OneToMany(mappedBy = "selectProcess")
    private List<Character> characters = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "editors_character_process",
            joinColumns = @JoinColumn(name = "PROCESS_ID"),
            inverseJoinColumns = @JoinColumn(name = "WORKER_ID")
    )
    private List<Editor> workers = new ArrayList<>();

    public int getProcessId() {
        return processId;
    }
    public void setProcessId(int processId) {
        this.processId = processId;
    }

    public List<Character> getCharacters() {
        return characters;
    }
    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public List<Editor> getWorkers() {
        return workers;
    }
    public void setWorkers(List<Editor> workers) {
        this.workers = workers;
    }
}
