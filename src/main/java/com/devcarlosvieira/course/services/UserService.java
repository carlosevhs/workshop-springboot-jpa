package com.devcarlosvieira.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.devcarlosvieira.course.entities.User;
import com.devcarlosvieira.course.repositories.UserRepository;
import com.devcarlosvieira.course.services.exceprions.DatabaseException;
import com.devcarlosvieira.course.services.exceprions.ResouceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {

		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResouceNotFoundException(id));
	}

	public User insert(User obj) {
		return repository.save(obj);
	}

	public void delete(Long id) {
		try {
			
		if (repository.findById(id).isEmpty()) {
			throw new ResouceNotFoundException(id);
		} else
			repository.deleteById(id);
    	} catch (DataIntegrityViolationException e) {
    		throw new DatabaseException(e.getMessage());
    	}
	}

	public User update(Long id, User obj) {
		try {
			User entity = repository.getReferenceById(id);
			updateData(entity, obj);
			return repository.save(entity);			
		} catch (EntityNotFoundException e) {
			throw new ResouceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
