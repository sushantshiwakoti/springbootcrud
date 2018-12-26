package com.example.springbootcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrud.model.Topic;
import com.example.springbootcrud.service.TopicService;


@RestController
@RequestMapping("/topic")
public class TopicController {
	@Autowired
	private TopicService topicService;
	
	@GetMapping
	public List<Topic> getAllTopic() {
		return topicService.getAllTopics();
		
	}
	@PostMapping
	public Topic addNewTopic(@RequestBody Topic t) {
		return topicService.addNewTopic(t);
		
	}
	@GetMapping("/{id}")
	public Topic getTopicById(@PathVariable("id") String topicid) {
		return this.topicService.getById(topicid);
		
	}
	@PutMapping("/{id}")
	public Topic updateTopic(@PathVariable("id") String topicid, @RequestBody Topic topic) {
		return this.topicService.update(topic);
	}
	@DeleteMapping("/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteById(id);
	}
	@DeleteMapping("/id")
	public void delete(Topic t) {
		topicService.delete(t);
	}
}
