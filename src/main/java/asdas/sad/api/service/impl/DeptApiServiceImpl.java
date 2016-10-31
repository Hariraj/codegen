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
import asdas.sad.model.Dept;

import java.util.List;
import asdas.sad.exception.NotFoundException;

@Service
public class DeptApiServiceImpl implements DeptApiService {
	@Autowired
	private DeptRepository deptRepository;

	@Override
	public List<Dept> findAllDept() throws NotFoundException {

		return deptRepository.findAll();

	}

	@Override
	public Dept updateDept(Dept dept) throws NotFoundException {

		return deptRepository.save(dept);

	}

	@Override
	public Dept addDept(Dept dept) throws NotFoundException {

		return deptRepository.save(dept);

	}

	@Override
	public Dept findByIdDept(Long id) throws NotFoundException {

		return deptRepository.findOne(id);

	}

	@Override
	public void deleteDept(Long id) throws NotFoundException {

		deptRepository.delete(id);

	}

}
