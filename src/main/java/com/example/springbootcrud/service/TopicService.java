package com.example.springbootcrud.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springbootcrud.model.Topic;

@Service
public class TopicService implements CrudManager<Topic,String>{
 private List<Topic> topics=new ArrayList<>(Arrays.asList(
		 	new Topic("spring","Spring framework", "Spring framework description"),
			new Topic("java", "Core Java", "Java core description"),
			new Topic("javascript","Javascript","JavaScript description")));
	
	public List<Topic> getAllTopics() {
		
		return this.topics;
		
	}

	@Override
	public Topic addNewTopic(Topic t) {
		this.topics.add(t);
		return t;
	}

	
	@Override
	public Topic getById(String id) {
		for(Topic topic:this.topics) {
			if(topic.getId().equals(id)) {
				return topic;
			}
		}
		return null;
		
	}

	@Override
	public Topic update(Topic t) {
		for(Topic topic:this.topics) {
			if(topic.getId().equals(t.getId())) {
				topic.setName(t.getName());
				topic.setDescription(t.getDescription());
			}
		}
		return t;
	}

	
	@Override
	public void deleteById(String id) {
		topics.removeIf(t->t.getId().equals(id));
	}

	@Override
	public void delete(Topic t) {
		topics.remove(t);
		
	}

	

	
	

}
