package com.rahul.webApplication.taskManager;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TaskManagerController {

    // list all tasks
    @RequestMapping("list-tasks")
    public String listAllTasks() {
        return "list-tasks";
    }
}
