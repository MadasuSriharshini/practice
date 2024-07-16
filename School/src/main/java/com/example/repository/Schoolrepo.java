package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.School;

public interface Schoolrepo extends JpaRepository<School, Integer> {

}

