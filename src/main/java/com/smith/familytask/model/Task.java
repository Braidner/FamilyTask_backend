package com.smith.familytask.model;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * @author Nick Smith
 */
@Entity
@FilterDefs({
        @FilterDef(name = Task.ASSIGNEE_FILTER, parameters = @ParamDef(name = "id", type = "long")),
        @FilterDef(name = Task.UPDATE_FILTER, parameters = @ParamDef(name = "updateDate", type = "date"))
})
@Filters({
        @Filter(name = Task.ASSIGNEE_FILTER, condition = "assignee.id = :id"),
        @Filter(name = Task.UPDATE_FILTER, condition = "updateDate > :date")
})
@Table(name = "t_task")
public class Task {

    public static final String ASSIGNEE_FILTER = "assigneeFilter";
    public static final String UPDATE_FILTER = "updateFilter";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long id;

    @Column(name = "taskName")
    private String taskName;

    @Column(name = "taskDescription")
    private String taskDescription;

    @ManyToOne
    @JoinColumn(name = "creator")
    private User creator;

    @ManyToOne
    @JoinColumn(name = "assignee")
    private User assignee;

    @Column(name = "creationDate")
    private Date creationDate;

    @Column(name = "updateDate")
    private Date updateDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
}
