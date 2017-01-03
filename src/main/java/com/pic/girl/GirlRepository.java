package com.pic.girl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GirlRepository extends JpaRepository<Girl, Integer> {

	// 通過年齡來查詢
	public List<Girl> findByAge(Integer age);
}
