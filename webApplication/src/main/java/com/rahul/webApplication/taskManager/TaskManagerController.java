package com.rahul.webApplication.taskManager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
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
    public String addNewTaskPage(ModelMap model) {
        model.addAttribute("task", new Todo());
        return "addTask";
    }

    @RequestMapping(value = "/add-task", method = RequestMethod.POST)
    public String newTaskAdded(@ModelAttribute Todo todo) { // binds form fields to a Todo object
        // spring will automatically fill "Todo" with the submitted form values
        taskManagerService.addTask("Default", todo.getDescription(), LocalDate.now().plusMonths(2),false);
        return "redirect:/list-tasks";
    }

}
