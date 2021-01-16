package com.vijen.app.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.vijen.app.service.FileService;

@RestController
public class DataExtractController {

	@Autowired
	FileService fileService;

	@PostMapping("/uploadFile")
	public String uploadFile(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

		fileService.uploadFile(file);

		redirectAttributes.addFlashAttribute("message",
				"You successfully uploaded " + file.getOriginalFilename() + "!");

		return "redirect:/";
	}

	@RequestMapping(value = { "/processcsv" }, method = RequestMethod.GET)
	public String getResp() {

		try {
			return fileService.loadFilesIntoDb();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = { "/fetchRecordsFormonth/{monthinnumber}/{year}" }, method = RequestMethod.GET)
	public ResponseEntity<byte[]> fetchRecordsFormonth(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("monthinnumber") Integer month, @PathVariable("year") Integer year) {

		return fileService.fetchRecordsFormonth(request, response, month, year);

	}

}
