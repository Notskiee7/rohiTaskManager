package rao.rohi.rohitaskmanager.data;

public class Taskkk {
    private String key;   //to identify the task by its own key
    private String Title;
    private String Subject;
    private String TaskImportance;  //task importance
    private String Owner;   //the name of the owner for this task

    public Taskkk(){

    }



    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }


    public String getTitle() {
        return Title;
    }


    public void setTitle(String title) {
        Title = title;
    }


    public String getSubject() {
        return Subject;
    }


    public void setSubject(String subject) {
        Subject = subject;
    }


    public String getTaskImportance() {
        return TaskImportance;
    }


    public void setTaskImportance(String taskImportance) {
        TaskImportance = taskImportance;
    }


    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }


    @Override
    public String toString() {
        return "Taskkk{" +
                "key='" + key + '\'' +
                ", Title='" + Title + '\'' +
                ", Subject='" + Subject + '\'' +
                ", TaskImportance='" + TaskImportance + '\'' +
                ", Owner='" + Owner + '\'' +
                '}';
    }



















}
