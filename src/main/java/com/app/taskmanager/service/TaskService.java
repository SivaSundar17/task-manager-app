package com.app.taskmanager.service;

import java.util.List;

import com.app.taskmanager.dto.TaskDto;
import com.app.taskmanager.entity.TaskEntity;

public interface TaskService {

	public TaskEntity addTask(TaskDto taskDto);

	public TaskEntity getTask(int id);

	public List<TaskEntity> getTasks();

	public TaskEntity updateTask(TaskEntity ts, int id);

	public String deleteTask(int id);

	
}
