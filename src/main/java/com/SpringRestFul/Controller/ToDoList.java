package com.SpringRestFul.Controller;

import com.SpringRestFul.model.entitys.Task;
import com.SpringRestFul.model.service.ITaskService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Jose Walter
 */

@RestController
@RequestMapping(value="todolist")
public class ToDoList {
    
    @Autowired
    private ITaskService taskService;
    
    @GetMapping(value="tasks")
    private List<Task> getTasks(){
        return taskService.getTask();
    }
    
    @GetMapping("/task/{id}")
    private Task getTasks(@PathVariable("id") int id){
        return taskService.getTaskId(id);
    }
    
    @DeleteMapping("/task/{id}")
    private void deleteTask(@PathVariable("id") int id){
        taskService.delete(id);
    }
    
    @PostMapping("/tasks")
    private Task saveTask(@RequestBody Task task){
        taskService.SaveOrUpdate(task);
        return task;
    }
    
    @PutMapping("/tasks")
    private Task update(@RequestBody Task task){
        taskService.SaveOrUpdate(task);
        return task;
    }
}
