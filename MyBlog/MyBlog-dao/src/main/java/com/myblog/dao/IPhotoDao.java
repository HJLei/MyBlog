package com.myblog.dao;

import com.myblog.entity.Photo;

import java.util.List;


public interface IPhotoDao {
	
	public void addPhoto(Photo photo);
	
	public List<Photo> findAuctionsByPage(int pageNo, int pageSize);

	public Long getAllCounts();

	public void delPhoto(String[] photoId);
	public void removePhoto(Photo photo);
	public Photo getPhoto(int id);
	
	public List<Photo> findAllPhotos();
	
	public List<Photo> findPhotosByTime();
}
