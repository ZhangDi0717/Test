package com.zhang.dao;

import com.zhang.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
public interface DepartmentImpl extends JpaRepository<Department,Long> {
}
