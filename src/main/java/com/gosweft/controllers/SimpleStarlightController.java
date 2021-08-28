package com.gosweft.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gosweft.helpers.EditDistance;
import com.gosweft.helpers.EditDistanceInput;
import com.gosweft.services.SweftService;

/**
 * @author nikhildahake
 */
@Controller
public class SimpleStarlightController {
	
	@Autowired
	private SweftService sweftService;
	
	@RequestMapping({"/"})
	public String index(Model model, HttpSession httpSession) {
		return "checkout";
	}
	
	@CrossOrigin(origins = "*")
	@RequestMapping(value = "/editdistance", method = RequestMethod.POST)
	@ResponseBody
	public EditDistance getEditDistance(@RequestBody EditDistanceInput editDistanceInput) {
		EditDistance ed = new EditDistance();
		ed.setDistance(sweftService.getEditDistance(editDistanceInput.getString1(), editDistanceInput.getString2()));
		return ed;
	}
}