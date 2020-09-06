package tm.taskmanager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import tm.taskmanager.modell.Quit;
import tm.taskmanager.modell.Task;
import tm.taskmanager.repository.TaskRepository;

import java.util.List;

@Controller
public class HomeController {

    private final TaskRepository taskRepository;

    public HomeController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/")
    public String start (){
        return "/index";
    }

    @GetMapping("/all")
    public String findAll (Model model){
        List<Task> all = taskRepository.findAll();
        model.addAttribute("all_tasks", all);
        return "/all";
    }

    @GetMapping("/all_opened")
    public String findAllOpenedTasks (Model model){
        List<Task> all = taskRepository.findTasksByQuitOrderByDeadlineDesc(Quit.OPENED);
        model.addAttribute("all_opened", all);
        return "/all_opened";
    }

    @GetMapping("/all_terminated")
    public String findAllTerminatedTasks (Model model){
        List<Task> all = taskRepository.findTasksByQuitOrderByDeadlineDesc(Quit.TERMINATED);
        model.addAttribute("all_terminated", all);
        return "/all_terminated";
    }

    @GetMapping("/add")
    public String addTask(Model model){
        Task task = new Task();
        taskRepository.save(task);
        model.addAttribute("task", task);
        return "add";
    }

    @GetMapping("/delate")
    public String removeTask(@RequestParam Long id){
        taskRepository.deleteById(id);
        return "redirect:/all";
    }
}
