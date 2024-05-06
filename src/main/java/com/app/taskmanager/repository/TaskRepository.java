package com.app.taskmanager.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.app.taskmanager.dto.TaskDto;
import com.app.taskmanager.entity.TaskEntity;

@Repository
public class TaskRepository {

	List<TaskEntity> tasks=new ArrayList<TaskEntity>();
	int taskId=1;
	
	public TaskEntity addTask(TaskDto taskDto) {
		
		TaskEntity ts=new TaskEntity();

		ts.setId(taskId);
		ts.setTitle(taskDto.getTitle());
		ts.setDescription(taskDto.getDescription());
		ts.setDeadline(taskDto.getDeadline());
		tasks.add(ts);
		taskId++;
		
		return ts;
		
	}
	
	public List<TaskEntity> getTasks(){
		return tasks;
	}
}

