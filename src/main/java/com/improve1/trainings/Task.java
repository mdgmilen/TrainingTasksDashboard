package com.improve1.trainings;

//@Lombok
public class Task {
//    ID, name,
  //  description, and status

    private int id;
    private String name;
    private String description;
    // TODO transform this to Enum, TODO, INPROGRESS, DONE
    private TaskStatus tStatus;

    public Task(int id, String name, String description, TaskStatus tStatus) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tStatus = tStatus;
    }

    public boolean moveForward() {
        if( this.tStatus == TaskStatus.TODO
            && Main.getInProgressTasksCount() < 3
        ) {
            this.tStatus = TaskStatus.IN_PROGRESS;
            return true;
        } else if (this.tStatus == TaskStatus.IN_PROGRESS) {
            this.tStatus = TaskStatus.DONE;
            return true;
        }
        return false;
    }

    public TaskStatus getTStatus() {
        return this.tStatus;
    }
}
