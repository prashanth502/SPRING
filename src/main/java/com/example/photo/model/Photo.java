package com.example.photo.model;

import javax.websocket.Decoder.Binary;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "photos")
public class Photo {
    @Id
    private String id;
    private String title;
    private Binary image;
    
   
    
	
	
	
	public Photo(String id, String title, Binary image) {
		
		this.id = id;
		this.title = title;
		this.image = image;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Binary getImage() {
		return image;
	}
	public void setImage(org.bson.types.Binary binary) {
		this.image = (Binary) binary;
	}
	@Override
	public String toString() {
		return "Photo [id=" + id + ", title=" + title + ", image=" + image + "]";
	}
	
    
    
}