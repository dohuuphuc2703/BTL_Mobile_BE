package com.example.btl_mobile_be.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btl_mobile_be.model.entity.Album;
import com.example.btl_mobile_be.model.service.AlbumService;

@RestController
@RequestMapping("/album")
public class AlbumController {

	@Autowired
	private AlbumService albumService;
	
	@PostMapping
    public Album createAlbum(@RequestBody Album album) {
        return albumService.createAlbum(album);
    }

    @GetMapping
    public List<Album> getAllAlbum() {
        return albumService.getAllAlbum();
    }

    @GetMapping("/{id}")
    public Album getAlbumById(@PathVariable int id) {
        return albumService.getAlbumById(id);
    }

    @PutMapping("/{id}")
    public Album updateAlbum(@PathVariable int id, @RequestBody Album album) {
        return albumService.updateAlbum(id, album);
    }

    @DeleteMapping("/{id}")
    public boolean deleteAlbum(@PathVariable int id) {
    	return albumService.deleteAlbum(id);
    }
}
