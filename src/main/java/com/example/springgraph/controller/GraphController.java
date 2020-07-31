package com.example.springgraph.controller;

import org.springframework.stereotype.Controller;
import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class GraphController {

	public GraphController() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/displayBarGraph")
	public String barGraph(Model model) {
		Map<String, Integer> surveyMap = new LinkedHashMap<>();
		surveyMap.put("Java", 40);
		surveyMap.put("Dev oops", 25);
		surveyMap.put("Python", 20);
		surveyMap.put(".Net", 15);
		model.addAttribute("surveyMap", surveyMap);
		return "barGraph";
	}

	@GetMapping("/displayPieChart")
	public String pieChart(Model model) {
		model.addAttribute("pass", 70);
		model.addAttribute("fail", 30);
		return "pieChart";
	}


}
