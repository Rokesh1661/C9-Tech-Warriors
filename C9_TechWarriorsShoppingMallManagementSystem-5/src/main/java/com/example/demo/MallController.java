package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MallController {
	@Autowired
	private MallService service;
	
	@GetMapping("/mall")
	public List<Mall> list()
	{
	return service.listAll();
}
	
	@GetMapping("/mall/{id}")
	public ResponseEntity<Mall> get(@PathVariable Integer id)
	{
		try
		{
			Mall mall = service.get(id);
			return new ResponseEntity<Mall>(mall,HttpStatus.OK);
		}
		catch (NoSuchElementException e)
		{
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

}
@PostMapping("/mall")
public void add(@RequestBody Mall mall)
{
	service.Save(mall);
}
	
@PutMapping("/mall/{id}")
public ResponseEntity <?> update(@RequestBody Mall mall,@PathVariable Integer id)
	{
		try
	{
Mall existMall = service.get(id);
	service.Save(mall);
	return new ResponseEntity<>(HttpStatus.OK);
}
catch (NoSuchElementException e)
{
	return new ResponseEntity<>(HttpStatus.NOT_FOUND);
}
	}

@DeleteMapping("/mall/{id}")
public void delete(@PathVariable Integer id)
{
	service.delete(id);
}
			
}
