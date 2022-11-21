package com.example.student.dal.studentdal;

import com.example.student.dal.studentdal.entity.Student;
import com.example.student.dal.studentdal.repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentdalApplicationTests {

	@Autowired
	private StudentRepository repo;

	@Test
	void contextLoads() {
		testsaveStudent();
		testFindById();
		testUpdateStudent();

	}
	@Test
	void testsaveStudent(){
		Student student=new Student();
		student.setName("saumya");
		student.setCourse("cse");
		student.setFee(30d);
		repo.save(student);
	}

	@Test
	void testFindById(){
		Student student= repo.findById(1l).get();
		System.out.println(student);
	}
	@Test
	void testUpdateStudent(){
		Student student= repo.findById(1l).get();
		student.setFee(40d);
		repo.save(student);

	}

	@Test
	void testDeleteStudent(){
		Student student= repo.findById(2l).get();
		repo.delete(student);
	}

}
