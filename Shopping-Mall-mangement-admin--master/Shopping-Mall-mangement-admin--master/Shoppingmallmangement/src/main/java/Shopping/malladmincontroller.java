package Shopping;

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

import jakarta.persistence.NoResultException;
@RestController
public class malladmincontroller {
	@Autowired
	private malladminservice service;
	@GetMapping("/malladminservice")
	public java.util.List<malladmin> list()
	{
		return service.listAll();
	}
	@GetMapping("/malladminservice/{storeid}")
	public ResponseEntity<malladmin> get(@PathVariable Integer storeid)
	{
		try
		{
			malladmin m=service.get(storeid);
			return new ResponseEntity<malladmin>(m,HttpStatus.OK);
		}
		catch (NoResultException e)
		{
			return new ResponseEntity<malladmin>(HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping("/malladminservice")
	public void add(@RequestBody malladmin m)
	{
		service.save(m);
	}
	@PutMapping("/malladminservice/{storeid}")
	public ResponseEntity<?> update(@RequestBody malladmin m, @PathVariable Integer storeid)
	{
		malladmin existm=service.get(storeid);
		service.save(existm);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	@DeleteMapping("/malladminservice/{storeid}")
	public void delete(@PathVariable Integer storeid)
	{
		service.delete(storeid);
	}
	}
	

