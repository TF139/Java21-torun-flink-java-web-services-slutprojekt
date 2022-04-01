package com.grit.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSVController {

	@RequestMapping(value = "/ShowCSV", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String ShowCSV() throws FileNotFoundException, IOException {
		CSVBean myReader = new CSVBean();
		myReader.readFile("sample.csv");
		String text = myReader.ShowJson();
		
		return text;
	}
}
