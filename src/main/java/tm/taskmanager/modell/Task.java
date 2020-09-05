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
    private GoalStatus start = GoalStatus.START;
    private GoalStatus inProgress = GoalStatus.IN_PROGRESS;
    private GoalStatus almostDone = GoalStatus.ALMOST_DONE;
    private GoalStatus done = GoalStatus.DONE;
    private GoalStatus stick = GoalStatus.STICK;

    @Enumerated(EnumType.STRING)
    private Quit opened = Quit.OPENED;
    private Quit quit = Quit.TERMINATED;

    @Basic
    private java.sql.Timestamp deadline;

    @Enumerated(EnumType.STRING)
    private Category work = Category.WORK;
    private Category homeDuties = Category.HOME_DUTIES;
    private Category home = Category.HOME;
    private Category school = Category.SCHOOL;
    private Category training = Category.TRAINING;
    private Category other = Category.OTHER;

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

    public GoalStatus getStart() {
        return start;
    }

    public void setStart(GoalStatus start) {
        this.start = start;
    }

    public GoalStatus getInProgress() {
        return inProgress;
    }

    public void setInProgress(GoalStatus inProgress) {
        this.inProgress = inProgress;
    }

    public GoalStatus getAlmostDone() {
        return almostDone;
    }

    public void setAlmostDone(GoalStatus almostDone) {
        this.almostDone = almostDone;
    }

    public GoalStatus getDone() {
        return done;
    }

    public void setDone(GoalStatus done) {
        this.done = done;
    }

    public GoalStatus getStick() {
        return stick;
    }

    public void setStick(GoalStatus stick) {
        this.stick = stick;
    }

    public Quit getOpened() {
        return opened;
    }

    public void setOpened(Quit opened) {
        this.opened = opened;
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

    public Category getWork() {
        return work;
    }

    public void setWork(Category work) {
        this.work = work;
    }

    public Category getHomeDuties() {
        return homeDuties;
    }

    public void setHomeDuties(Category homeDuties) {
        this.homeDuties = homeDuties;
    }

    public Category getHome() {
        return home;
    }

    public void setHome(Category home) {
        this.home = home;
    }

    public Category getSchool() {
        return school;
    }

    public void setSchool(Category school) {
        this.school = school;
    }

    public Category getTraining() {
        return training;
    }

    public void setTraining(Category training) {
        this.training = training;
    }

    public Category getOther() {
        return other;
    }

    public void setOther(Category other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", start=" + start +
                ", inProgress=" + inProgress +
                ", almostDone=" + almostDone +
                ", done=" + done +
                ", stick=" + stick +
                ", opened=" + opened +
                ", terminated=" + quit +
                ", deadline=" + deadline +
                ", work=" + work +
                ", homeDuties=" + homeDuties +
                ", home=" + home +
                ", school=" + school +
                ", training=" + training +
                ", other=" + other +
                '}';
    }
}
