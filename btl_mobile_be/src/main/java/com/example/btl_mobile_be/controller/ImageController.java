package com.example.btl_mobile_be.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.btl_mobile_be.model.entity.Image;
import com.example.btl_mobile_be.model.service.ImageService;

@RestController
@RequestMapping("/image")
public class ImageController {
	@Autowired
    private ImageService imageService;
	
	@PostMapping
    public Image createImage(@RequestBody Image image) {
        return imageService.createImage(image);
    }



    @GetMapping("/{id}")
    public Image getImageById(@PathVariable int id) {
        return imageService.getImageById(id);
    }

    @PutMapping("/{id}")
    public Image updateImage(@PathVariable int id, @RequestBody Image image) {
        return imageService.updateImage(id, image);
    }

    @DeleteMapping("/{id}")
    public boolean deleteImage(@PathVariable int id) {
    	return imageService.deleteImage(id);
    }
}
