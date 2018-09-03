package com.lalitstuff.springbootapi1.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	TopicRepository topicRepository;

	public List<Topic> getAllTopics() {
		List<Topic> topics = new ArrayList<Topic>();
		topicRepository.findAll()
		.forEach(topics::add);
		return topics;
	}

	public void addTopic(Topic topic) {
		topicRepository.save(topic);
	}

	public Topic getTopic(int id) {
		return topicRepository.findById(id).orElse(null);
	}

	public void updateTopic(Topic topic) {
		topicRepository.save(topic);
	}
	
	public void deleteTopic(int id) {
		topicRepository.deleteById(id);
	}
}
