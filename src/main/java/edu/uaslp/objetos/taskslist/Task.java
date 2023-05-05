package edu.uaslp.objetos.taskslist;

import edu.uaslp.objetos.exceptions.TaskListException;
import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;

public class Task {
    private String title;
    private String description;
    private LocalDateTime dueDate;
    private boolean done;

    Task(){
        title = null;
        description = null;
        dueDate = null;
        done = false;
    }
    Task(String title, String description, LocalDateTime dueDate, boolean done){
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.done = done;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) throws TaskListException{
        if(dueDate.isBefore(LocalDateTime.now())){
            throw new TaskListException("Due date is set in the past");
        }
        else this.dueDate = dueDate;
    }

    public void setDone(boolean done){
        this.done = done;
    }
    public boolean isDone(){
        return done;
    }
}
