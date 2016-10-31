package asdas.sad.api.service;

import asdas.sad.model.Emp;

import asdas.sad.exception.NotFoundException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface EmpApiService {
  
      List<Emp> findAllEmp()
      throws NotFoundException;
  
      Emp updateEmp(Emp emp)
      throws NotFoundException;
  
      Emp addEmp(Emp emp)
      throws NotFoundException;
  
      Emp findByIdEmp(Long id)
      throws NotFoundException;
  
      void deleteEmp(Long id)
      throws NotFoundException;
  
}
