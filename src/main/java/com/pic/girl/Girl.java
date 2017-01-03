package com.pic.girl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Girl {

	// http://stackoverflow.com/questions/2011528/hibernate-auto-increment-id
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String cupSize;

	private Integer age;

	public Girl() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCupSize() {
		return cupSize;
	}

	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}
