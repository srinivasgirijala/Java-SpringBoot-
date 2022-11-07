package com.example.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class userentities {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private  String email;
	private String address;
	private Date usercreateddate;
	private Date userupdateddate;
}
