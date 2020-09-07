package tm.taskmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tm.taskmanager.modell.Quit;
import tm.taskmanager.modell.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {


    List<Task> findTasksByQuitOrderByDeadlineDesc(Quit quit);
}
