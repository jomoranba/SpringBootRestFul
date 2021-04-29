/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringRestFul.model.service;

import com.SpringRestFul.model.entitys.Task;
import java.util.List;

/**
 *
 * @author Jose Walter
 */
public interface ITaskService {
    
    public List<Task> getTask();
    
    public Task getTaskId(int id);
    
    public void SaveOrUpdate(Task task);
    
    public void delete(int id);
    
    public void update(Task task, int id);
     
}
