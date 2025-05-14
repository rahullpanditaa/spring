package com.rahul.webApplication.taskManager;

import com.rahul.webApplication.entities.Todo;
import com.rahul.webApplication.repositories.TodoRepository;
import jakarta.validation.Valid;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;

@Controller
public class TaskManagerJpaController {

    private TaskManagerService taskManagerService;
    private TodoRepository todoRepository;

    public TaskManagerJpaController(TaskManagerService taskManagerService, TodoRepository repository) {
        this.taskManagerService = taskManagerService;
        this.todoRepository = repository;
    }

    // list all tasks
    @RequestMapping("/list-tasks")
    public String listAllTasks(ModelMap model) {
        String username = getLoggedInUsername();
        model.addAttribute("tasks", todoRepository.findByName(username));
        return "listTasks";
    }

    private String getLoggedInUsername() {
        var authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

    // endpoint for adding a new task
    // map to this method if a GET request is received i.e. submitting the new task details
    @RequestMapping(value = "/add-task", method = RequestMethod.GET)
    public String addNewTaskPage(ModelMap model) {
        model.addAttribute("todo", new Todo());
        return "addTask";
    }

    @RequestMapping(value = "/add-task", method = RequestMethod.POST)
    public String newTaskAdded(@Valid @ModelAttribute Todo todo, BindingResult result) { // binds form fields to a Todo object
        // spring will automatically fill "Todo" with the submitted form values
        if (result.hasErrors()) {
            return "addTask";
        }
        taskManagerService.addTask("Default", todo.getDescription(), LocalDate.now().plusMonths(2),false);
        return "redirect:/list-tasks";
    }

    @RequestMapping(value = "/delete-task")
    public String deleteTask(@RequestParam int id) {
        // delete todo
        taskManagerService.deleteTaskById(id);
        return "redirect:/list-tasks";
//        return "deleteTask";
    }

    @RequestMapping(value = "/update-task", method = RequestMethod.GET)
    public String updateTaskPage(@RequestParam int id, ModelMap model) {
        Todo todo = taskManagerService.findById(id);
        model.addAttribute("todo", todo);
        return "addTask";
    }

    @RequestMapping(value = "/update-task", method = RequestMethod.POST)
    public String updateTask(@Valid @ModelAttribute Todo todo, BindingResult result) {
        if (result.hasErrors()) {
            return "addTask";
        }

        taskManagerService.updateTodo(todo);
        return "redirect:/list-tasks";
    }

}

