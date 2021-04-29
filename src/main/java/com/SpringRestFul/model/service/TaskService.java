/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringRestFul.model.service;

import com.SpringRestFul.model.dao.ITaskDao;
import com.SpringRestFul.model.entitys.Task;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jose Walter
 */
@Service
public class TaskService implements ITaskService{

    @Autowired
    private ITaskDao taskDao;
    
    @Override
    public List<Task> getTask() {
        return (List<Task>) taskDao.findAll();
    }

    @Override
    public Task getTaskId(int id) {
        return taskDao.findById(id).get();
    }

    @Override
    public void SaveOrUpdate(Task task) {
        taskDao.save(task);
    }

    @Override
    public void delete(int id) {
        taskDao.deleteById(id);
    }

    @Override
    public void update(Task task, int id) {
        taskDao.save(task);
    }
    
    
}
