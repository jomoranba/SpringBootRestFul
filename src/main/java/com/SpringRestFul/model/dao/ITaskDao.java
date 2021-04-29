/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.SpringRestFul.model.dao;

import com.SpringRestFul.model.entitys.Task;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Jose Walter
 */
public interface ITaskDao extends CrudRepository<Task, Integer>{
    
}
