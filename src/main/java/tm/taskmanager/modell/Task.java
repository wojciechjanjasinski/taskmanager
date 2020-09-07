package tm.taskmanager.modell;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @Enumerated(EnumType.STRING)
    private GoalStatus goalStatus;

    @Enumerated(EnumType.STRING)
    private Quit quit;

    @Basic
    private java.sql.Timestamp deadline;

    @Enumerated(EnumType.STRING)
    private Category category;

    public Task() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GoalStatus getGoalStatus() {
        return goalStatus;
    }

    public void setGoalStatus(GoalStatus goalStatus) {
        this.goalStatus = goalStatus;
    }

    public Quit getQuit() {
        return quit;
    }

    public void setQuit(Quit quit) {
        this.quit = quit;
    }

    public Timestamp getDeadline() {
        return deadline;
    }

    public void setDeadline(Timestamp deadline) {
        this.deadline = deadline;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", goalStatus=" + goalStatus +
                ", quit=" + quit +
                ", deadline=" + deadline +
                ", category=" + category +
                '}';
    }
}
