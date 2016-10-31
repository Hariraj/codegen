package asdas.sad.model.repository;

import asdas.sad.model.*;

import java.util.Date;
import asdas.sad.model.Dept;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface EmpRepository extends JpaRepository<Emp, Long>{

}



