package com.demo.form.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("form2Repository")
public interface Form2Repository extends JpaRepository<FormModel, Long>{

}
