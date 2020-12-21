package com.spjpa.verinitespjpa.controller;

import java.io.File;
import java.io.IOException;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class FileUploadController {
	
	@PostMapping(value="/uploadfile")
	public String storeImage(@RequestParam MultipartFile file) throws IllegalStateException, IOException {
		
		String fileName=file.getOriginalFilename();
		System.out.println("--------"+fileName);
		
		File f=new File("/Users/abhi/Desktop/verinite/file_data/"+fileName);
		
		file.transferTo(f);
		String filePath=f.getAbsolutePath();
		return "File uploaded successfully";
	}

}
