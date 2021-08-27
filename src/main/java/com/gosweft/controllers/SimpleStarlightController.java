package com.gosweft.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gosweft.helpers.EditDistance;

/**
 * @author nikhildahake
 */
@Controller
public class SimpleStarlightController {
	
	@RequestMapping({"/"})
	public String index(Model model, HttpSession httpSession) {
		return "checkout";
	}
	
	@RequestMapping(value = "/editdistance", method = RequestMethod.POST)
	@ResponseBody
	public EditDistance getEditDistance(@RequestParam("string1")String string1, @RequestParam("string2")String string2) {
		EditDistance ed = new EditDistance();
		ed.setDistance(2);
		return ed;
	}
}