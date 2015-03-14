package com.smith.familytask.controller.rest;

import com.smith.familytask.controller.AbstractController;
import com.smith.familytask.model.Task;
import com.smith.familytask.model.User;
import com.smith.familytask.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

/**
 * Created by smith on 08.03.2015.
 */
@RestController
@RequestMapping("rest/tasks")
public class TaskController extends AbstractController {

    @Autowired
    private TaskRepository taskRepository;


    @RequestMapping("test")
    public String test() {
        return "New Task";
    }

    @RequestMapping("createTask")
    public Boolean createTask() {
        Task task = new Task();
        taskRepository.createTask(task);
        return true;
    }

    @RequestMapping("update/{date}")
    public @ResponseBody List<Task> loadTasks(@PathVariable Date date) {
        return taskRepository.findTasks(getCurrentUser().getId(), date);
    }
}
