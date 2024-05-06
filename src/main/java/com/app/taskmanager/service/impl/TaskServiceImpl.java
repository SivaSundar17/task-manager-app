package com.app.taskmanager.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.taskmanager.dto.TaskDto;
import com.app.taskmanager.entity.TaskEntity;
import com.app.taskmanager.repository.TaskRepository;
import com.app.taskmanager.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService{

	@Autowired
	TaskRepository taskRepository;
	
	@Override
	public TaskEntity addTask(TaskDto taskDto) {
		return this.taskRepository.addTask(taskDto);
	}

	@Override
	public TaskEntity getTask(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TaskEntity> getTasks() {
		// TODO Auto-generated method stub
		return this.taskRepository.getTasks();
	}

	@Override
	public TaskEntity updateTask(TaskEntity ts, int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteTask(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
