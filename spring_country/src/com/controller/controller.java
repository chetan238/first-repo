package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.DAO;
import com.model.CountryModel;
import com.model.StateModel;



@Controller
public class controller {

	@Autowired
	private DAO d;

	@RequestMapping(value = "hello.html", method = RequestMethod.GET)
	public ModelAndView load() {
		return new ModelAndView("country", "CD", new CountryModel());

	}

	@RequestMapping(value = "insert.html", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute CountryModel cm)

	{
		System.out.println(cm);
		d.insert(cm);
		return new ModelAndView("redirect:/search.html");

	}

	@RequestMapping(value = "search.html", method = RequestMethod.GET)
	public ModelAndView search(@ModelAttribute CountryModel cm)

	{

		List search = d.search();
		return new ModelAndView("search", "SD", search);

	}

	@RequestMapping(value = "delete.html", method = RequestMethod.GET)
	public ModelAndView delete(@ModelAttribute CountryModel cm, @RequestParam int delete_id)

	{
		cm.setId(delete_id);
		d.delete(cm);
		return new ModelAndView("redirect:/search.html");

	}

	@RequestMapping(value = "edit.html", method = RequestMethod.GET)
	public ModelAndView edit(@ModelAttribute CountryModel cm, @RequestParam int edit_id)

	{
		cm.setId(edit_id);
		List ls = d.edit(cm);
		return new ModelAndView("country", "CD", ls.get(0));

	}

	/* STATE CONTROLLER */

	@RequestMapping(value = "hi.html", method = RequestMethod.GET)
	public ModelAndView loadS() {
		List search = d.search();
		return new ModelAndView("state", "SD", new StateModel()).addObject("state", search);
	}

	@RequestMapping(value = "insertstate.html", method = RequestMethod.POST)
	public ModelAndView insertS(@ModelAttribute StateModel sm, @RequestParam int cid) {
		System.out.println(sm.getSn());
		System.out.println(sm.getSd());
		// System.out.println(sm.getId());
		System.out.println(cid);

		CountryModel c = new CountryModel();
		c.setId(cid);

		sm.setCm(c);

		d.insertState(sm);

		return new ModelAndView("redirect:/searchState.html");

	}

	@RequestMapping(value = "deleteState.html", method = RequestMethod.GET)
	public ModelAndView deleteState(@ModelAttribute StateModel sm, @RequestParam int delete_id)

	{
		sm.setId(delete_id);
		d.deleteState(sm);
		return new ModelAndView("redirect:/searchState.html");

	}

	@RequestMapping(value = "searchState.html", method = RequestMethod.GET)
	public ModelAndView searchState()

	{

		List searchState = d.searchState();
		return new ModelAndView("viewState", "SSD", searchState);
	}

	@RequestMapping(value = "editState.html", method = RequestMethod.GET)
	public ModelAndView editState(@ModelAttribute StateModel sm, @RequestParam int edit_id, @RequestParam int country_id)

	{
		CountryModel cm = new CountryModel();
		cm.setId(country_id);
		sm.setId(edit_id);
		sm.setCm(cm);
		List ls=d.edithState(sm);
		
		
		return new ModelAndView("state", "SD",ls.get(0));
	}
}
