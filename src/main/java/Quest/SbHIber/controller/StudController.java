package Quest.SbHIber.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Quest.SbHIber.Entity.Student;
import Quest.SbHIber.Service.StudService;

@RestController
public class StudController {
	
	@Autowired
	StudService stser;
	
	@PostMapping("/save")
	public Student save(@RequestBody Student st) {
		return stser.savestud(st);
	}
	
	@GetMapping("/view")
	public List<Student> getallstud(){
		return stser.fetchallStud();
	}
	
	@PostMapping("/update")
	public Student updatestud(@RequestBody Student st) {
		return stser.savestud(st);
	}
	
	@GetMapping("/findbyid/{id}")
	public Student findbyid(@PathVariable("id") int id) {
		return stser.fetchbyId(id);
	}
	
	@GetMapping("/delete/{id}")
	public String deletestud(@PathVariable("id") int id) {
		stser.delete(id);
		return "Successfully deleted";
	}
} 
