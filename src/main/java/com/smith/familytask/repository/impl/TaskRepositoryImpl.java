package com.smith.familytask.repository.impl;

import com.smith.familytask.model.Task;
import com.smith.familytask.repository.TaskRepository;
import com.smith.familytask.utils.HibernateSupport;
import org.springframework.stereotype.Repository;

/**
 * Created by smith / 08.03.2015.
 */
@Repository("taskRepository")
public class TaskRepositoryImpl extends HibernateSupport implements TaskRepository {

    @Override
    public void createTask(Task task) {
        openSession().save(task);
    }
}
