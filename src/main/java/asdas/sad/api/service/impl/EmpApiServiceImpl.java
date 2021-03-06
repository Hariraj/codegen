package asdas.sad.api.service.impl;

import asdas.sad.api.service.*;
import asdas.sad.model.*;
import org.springframework.stereotype.Service;
import asdas.sad.model.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import org.springframework.beans.factory.annotation.Autowired;
import asdas.sad.model.Emp;

import java.util.List;
import asdas.sad.exception.NotFoundException;

@Service
public class EmpApiServiceImpl implements EmpApiService {
  	  @Autowired
  	  private EmpRepository empRepository ;
  	  
  
  
      @Override
      public List<Emp> findAllEmp()
      throws NotFoundException {
      
        
  		
  		
  			return empRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp updateEmp(Emp emp)
      throws NotFoundException {
      
         
        	return empRepository.save(emp);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp addEmp(Emp emp)
      throws NotFoundException {
      
         
        	return empRepository.save(emp);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public Emp findByIdEmp(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return empRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
  
      @Override
      public void deleteEmp(Long id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
  		  empRepository.delete(id);
  		
  		
  		
  }
  
}
