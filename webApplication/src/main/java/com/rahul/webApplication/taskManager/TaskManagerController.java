package com.rahul.webApplication.taskManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("/add-task")
    public String addNewTask(ModelMap model) {
        return "addTask";
    }
}
