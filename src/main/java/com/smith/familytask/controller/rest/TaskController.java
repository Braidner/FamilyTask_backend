package com.smith.familytask.controller.rest;

import com.smith.familytask.controller.AbstractController;
import com.smith.familytask.model.Task;
import com.smith.familytask.model.TaskResult;
import com.smith.familytask.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

import static org.springframework.format.annotation.DateTimeFormat.ISO.DATE;

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
    public @ResponseBody
    TaskResult loadTasks(@PathVariable @DateTimeFormat(iso = DATE) Date date) {
        List<Task> tasks = taskRepository.findTasks(getCurrentUser().getId(), date);
        TaskResult result = new TaskResult();
        result.setTasks(tasks);
        return result;
    }
}
