/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taskplannerapp;

import java.util.Date;

/**
 *
 * @author dogat
 */
public class Task {
     private int Id;
    private String Task_Name;
    private String Short_Desc;
    private int Priority;
    private Date Deadline;
    private boolean Reminder_Image;
    private Date Entry_Date;
    private int User_Id;

    
    public Task(String Task_Name, String Short_Desc, int Priority, Date Deadline, boolean Reminder_Image, int User_Id) {
        this.Task_Name = Task_Name;
        this.Short_Desc = Short_Desc;
        this.Priority = Priority;
        this.Deadline = Deadline;
        this.Reminder_Image = Reminder_Image;
        this.User_Id = User_Id;
    }

    public Task(int Id, String Task_Name, String Short_Desc, int Priority, Date Deadline, boolean Reminder_Image, Date Entry_Date) {
        this.Id = Id;
        this.Task_Name = Task_Name;
        this.Short_Desc = Short_Desc;
        this.Priority = Priority;
        this.Deadline = Deadline;
        this.Reminder_Image = Reminder_Image;
        this.Entry_Date = Entry_Date;
    }
    

    public Task() {
    }

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int User_Id) {
        this.User_Id = User_Id;
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTask_Name() {
        return Task_Name;
    }

    public void setTask_Name(String Task_Name) {
        this.Task_Name = Task_Name;
    }

    public String getShort_Desc() {
        return Short_Desc;
    }

    public void setShort_Desc(String Short_Desc) {
        this.Short_Desc = Short_Desc;
    }

    public int getPriority() {
        return Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    public Date getDeadline() {
        return Deadline;
    }

    public void setDeadline(Date Deadline) {
        this.Deadline = Deadline;
    }

    public boolean isReminder_Image() {
        return Reminder_Image;
    }

    public void setReminder_Image(boolean Reminder_Image) {
        this.Reminder_Image = Reminder_Image;
    }

    public Date getEntry_Date() {
        return Entry_Date;
    }

    public void setEntry_Date(Date Entry_Date) {
        this.Entry_Date = Entry_Date;
    }
    
    
}
