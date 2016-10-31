package asdas.sad.api.service;

import asdas.sad.model.Dept;

import asdas.sad.exception.NotFoundException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

public interface DeptApiService {
  
      List<Dept> findAllDept()
      throws NotFoundException;
  
      Dept updateDept(Dept dept)
      throws NotFoundException;
  
      Dept addDept(Dept dept)
      throws NotFoundException;
  
      Dept findByIdDept(Long id)
      throws NotFoundException;
  
      void deleteDept(Long id)
      throws NotFoundException;
  
}
