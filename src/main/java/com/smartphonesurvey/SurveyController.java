package com.smartphonesurvey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/surveys")
@CrossOrigin(origins = "http://127.0.0.1:5500")
public class SurveyController 
{
	@Autowired
	private SurveyRepository surveyRepository;
	
//	public SurveyController(SurveyRepository surveyRepository)
//	{
//		this.surveyRepository=surveyRepository;
//	}
	
	@PostMapping
	public Survey submitSurvey(@RequestBody Survey survey)
	{
		return surveyRepository.save(survey);
	}
	
	@GetMapping
	public List<Survey> getAllSurveys()
	{
		return surveyRepository.findAll();
	}

}
