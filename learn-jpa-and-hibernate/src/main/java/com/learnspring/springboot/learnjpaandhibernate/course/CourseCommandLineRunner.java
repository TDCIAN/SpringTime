package com.learnspring.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learnspring.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.learnspring.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.learnspring.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
		repository.save(new Course(1, "Learn AWS SpringDataJPA!", "Ranga~"));
		repository.save(new Course(2, "Learn Azure SpringDataJPA!", "Ranga!"));
		repository.save(new Course(3, "Learn DevSecOps SpringDataJPA!", "Ranga?"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println(repository.findByAuthor("Ranga!"));
		System.out.println(repository.findByAuthor("Ranga?"));
		
		System.out.println(repository.findByName("Learn DevSecOps SpringDataJPA!"));
	}

}
