package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.repository.entities.PostIt;

@Repository
public interface PostItRepository extends CrudRepository<PostIt, Integer> {

}
