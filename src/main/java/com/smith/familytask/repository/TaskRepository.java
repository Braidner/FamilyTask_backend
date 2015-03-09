package com.smith.familytask.repository;

import com.smith.familytask.model.Task;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * {@link Repository} to access {@link Task}
 *
 * @author Nick Smith
 */
public interface TaskRepository {
    void createTask(Task task);

    List<Task> findTasks(Long id, Date date);
}
