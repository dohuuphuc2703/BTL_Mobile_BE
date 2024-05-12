package com.example.btl_mobile_be.model.service;

import java.util.List;

import com.example.btl_mobile_be.model.entity.Album;

public interface AlbumService {
	Album createAlbum(Album album);
	Album updateAlbum(int id, Album album);
	Album getAlbumById(int id);
	boolean deleteAlbum(int id);
	List<Album> getAllAlbum();
}
