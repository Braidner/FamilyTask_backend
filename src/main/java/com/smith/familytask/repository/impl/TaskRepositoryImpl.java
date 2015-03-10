package com.smith.familytask.repository.impl;

import com.smith.familytask.model.Task;
import com.smith.familytask.repository.TaskRepository;
import com.smith.familytask.utils.HibernateSupport;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by smith / 08.03.2015.
 */
@Repository("taskRepository")
@SuppressWarnings("unchecked")
public class TaskRepositoryImpl extends HibernateSupport implements TaskRepository {

    @Override
    public void createTask(Task task) {
        openSession().save(task);
    }


    @Override
    public List<Task> findTasks(Long id, Date date) {
        openSession().enableFilter(Task.ASSIGNEE_FILTER).setParameter("id", id);
        if (date != null)
            openSession().enableFilter(Task.UPDATE_FILTER).setParameter("date", date);

        return openSession().createQuery("from Task").list();
    }
}
