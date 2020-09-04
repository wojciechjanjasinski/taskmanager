package tm.taskmanager.modell;

import javax.persistence.*;

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

    private Boolean finished;

    @Enumerated(EnumType.STRING)
    private Category work = Category.WORK;
    private Category homeDuties = Category.HOME_DUTIES;
    private Category home = Category.HOME;
    private Category school = Category.SCHOOL;
    private Category training = Category.TRAINING;
    private Category other = Category.OTHER;
}
