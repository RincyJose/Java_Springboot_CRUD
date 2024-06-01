package Quest.SbHIber.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Quest.SbHIber.Entity.Student;
import Quest.SbHIber.Repo.StudRepo;

@Service
public class StudService {
	
	@Autowired
	StudRepo srepo;
	
	public Student savestud(Student stud) {
		return srepo.save(stud);
	}
	
	public List<Student> fetchallStud(){
		return srepo.findAll();
	}
	
	public Student fetchbyId(int id) {
		return srepo.findById(id).get();
	}
	
	public void delete(int id) {
		 srepo.deleteById(id);
	}

}
