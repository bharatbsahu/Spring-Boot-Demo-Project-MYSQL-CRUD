// Java Program to Illustrate Department File

// Importing package module to code fragment
package com.amiya.springbootdemoproject.entity;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter

// Class
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}
