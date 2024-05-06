package com.app.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.taskmanager.dto.TaskDto;
import com.app.taskmanager.entity.TaskEntity;
import com.app.taskmanager.service.TaskService;

@RestController
@RequestMapping("/task")
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	public ResponseEntity<TaskDto> getTask(@PathVariable int id){
		return null;		
	}
	
	@GetMapping("")
	public ResponseEntity<List<TaskEntity>> getTasks(){
		return ResponseEntity.ok(this.taskService.getTasks());
	}
	
	@PostMapping("")
	public ResponseEntity<TaskEntity> addTask(@RequestBody TaskDto taskDto){
		
		return ResponseEntity.ok(this.taskService.addTask(taskDto));
		
	}
	
	public ResponseEntity<TaskDto> updateTask(@RequestBody TaskDto taskDto, @PathVariable int id){
		return null;
	}
	
	public ResponseEntity<String> deleteTask(@PathVariable int id){
		return null;
	}
	
	public ResponseEntity<Object>  getNotesByTask(@PathVariable int id){
		return null;
	}
	
	public ResponseEntity<Object> addNoteByTask(){
		return null;
	}
	
	public ResponseEntity<String> deleteNoyeByTask(@PathVariable int taskId, @PathVariable int noteId){
		return null;
	}
	

}
