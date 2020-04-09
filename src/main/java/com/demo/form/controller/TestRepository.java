package com.demo.form.controller;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("testRepository")
public interface TestRepository extends JpaRepository<TestModel, Long> {

	TestModel findByName(String name);
}
