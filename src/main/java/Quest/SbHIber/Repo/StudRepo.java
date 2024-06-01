package Quest.SbHIber.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Quest.SbHIber.Entity.Student;

@Repository
public interface StudRepo extends JpaRepository<Student, Integer> {

}
