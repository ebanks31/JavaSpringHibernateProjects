package com.ebanks.springapp.controllers;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * The HomeController for handling REST request from the home page.
 */
@Controller
public class CartController {
	private static final Logger HOME_LOGGER = Logger.getLogger(CartController.class);
	//TODO: Need to more REST End points for Cart Controller.

	/**
	 * Shows the home page
	 *
	 * @param model
	 *            the model
	 * @return the page view
	 */
	@RequestMapping(value = "/cart", method = RequestMethod.GET)
	public String home(final Model model) {
		HOME_LOGGER.info("Going to home page");
		return "home";
	}
}