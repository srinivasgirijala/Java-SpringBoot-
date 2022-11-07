package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.userentities;

@Repository
public interface userrepository extends JpaRepository<userentities,Long> {

	userentities findByEmail(String email);


}
