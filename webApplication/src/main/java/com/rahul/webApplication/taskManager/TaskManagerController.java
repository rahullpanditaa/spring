package com.rahul.webApplication.taskManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TaskManagerController {

    private TaskManagerService taskManagerService;

    public TaskManagerController(TaskManagerService taskManagerService) {
        this.taskManagerService = taskManagerService;
    }

    // list all tasks
    @RequestMapping("/list-tasks")
    public String listAllTasks(ModelMap model) {
        model.addAttribute("tasks", taskManagerService.findByTeacherName("blah"));
        return "listTasks";
    }

    // endpoint for adding a new task
    // map to this method if a GET request is received i.e. submitting the new task details
    @RequestMapping(value = "/add-task", method = RequestMethod.GET)
    public String addNewTaskPage() {
        return "addTask";
    }

    @RequestMapping(value = "/add-task", method = RequestMethod.POST)
    public String newTaskAdded(ModelMap model, @RequestParam String description) {
        taskManagerService.addTask((String) model.get("name"), description, LocalDate.now().plusMonths(2),false);
        return "redirect:/list-tasks";
    }

}
