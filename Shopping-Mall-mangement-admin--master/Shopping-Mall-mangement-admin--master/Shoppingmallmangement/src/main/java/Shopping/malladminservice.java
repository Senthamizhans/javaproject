package Shopping;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
@Service
@Transactional
public class malladminservice {

	@Autowired
	private malladminrepository repo;
		public List<malladmin> listAll()
		{
			return repo.findAll();
		}
		public void save(malladmin m)
		{
			repo.save(m);
		}
		public malladmin get(Integer Storeid) 
		{
			return repo.findById(Storeid).get();
		}
		public void delete(Integer Storeid)
		{
			repo.deleteById(Storeid);
		}
		
		}



