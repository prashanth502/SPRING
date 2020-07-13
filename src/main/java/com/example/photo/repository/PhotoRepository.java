package com.example.photo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.photo.model.Photo;

public interface PhotoRepository extends MongoRepository<Photo, String> {

}
