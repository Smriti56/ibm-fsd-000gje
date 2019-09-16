package com.example.demo.data;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Gallery {

private Long galleryId;
private List<Object> images;
public Long getGalleryId() {
	return galleryId;
}
public void setGalleryId(Long galleryId) {
	this.galleryId = galleryId;
}
public List<Object> getImages() {
	return images;
}
public void setImages(List<Object> images) {
	this.images = images;
}




}
