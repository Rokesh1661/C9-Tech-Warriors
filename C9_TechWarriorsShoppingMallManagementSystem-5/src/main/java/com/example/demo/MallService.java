package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class MallService {
	
	@Autowired
	private MallRepository repo;

	public List<Mall> listAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public Mall get(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public void Save(Mall mall) {
		// TODO Auto-generated method stub
		repo.save(mall);
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}

