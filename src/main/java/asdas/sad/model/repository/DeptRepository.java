package asdas.sad.model.repository;

import asdas.sad.model.*;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface DeptRepository extends JpaRepository<Dept, Long>{

}



