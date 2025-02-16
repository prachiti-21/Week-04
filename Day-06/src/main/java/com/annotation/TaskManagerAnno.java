package com.annotation;


import java.lang.reflect.*;
import java.lang.annotation.*;

//import static jdk.nio.zipfs.ZipFileAttributeView.AttrID.method;

@TaskInfo(priority = 1,assignedTo = "Leela")
class TaskManager{
    TaskManager(String taskName,String taskHolder){
        this.taskName=taskName;
        this.taskHolder=taskHolder;
    }
    private String taskName;
    private String taskHolder;
    public  String getTaskName(){
        return taskName;
    }
    public String getTaskHolder(){
        return taskHolder;
    }
}
public class TaskManagerAnno {
    public static void main(String[] args) throws Exception {


        TaskManager taskManager = new TaskManager("file handling","Manish");
        Method method = taskManager.getMethod("getTaskName");
        if (taskManager.getClass().isAnnotationPresent(TaskInfo.class)){
            TaskInfo annotation=method.getAnnotation(TaskInfo.class);
            System.out.println("Task Information: ");
            System.out.println(TaskInfo.class);
            System.out.print("Task name: "+taskManager.getTaskName());
            System.out.print("\nTask Holder: "+taskManager.getTaskHolder());

        }
    }
}
