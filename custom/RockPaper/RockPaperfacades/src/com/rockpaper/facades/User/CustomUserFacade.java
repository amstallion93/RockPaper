/**
 *
 */
package com.rockpaper.facades.User;

import de.hybris.platform.servicelayer.user.UserService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


/**
 * @author smarokky
 *
 */
@Component("customUserFacade")
public class CustomUserFacade
{
	@Autowired
	private UserService userService;
	private final Logger LOG = Logger.getLogger(CustomUserFacade.class);

	public boolean isUserAnonymous()
	{

		LOG.info("Hitting is anonymous");
		if (userService.getCurrentUser().getName().equals("Anonymous"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	/*
	 * if (userService.getCurrentUser().getName().equals("Anonymous")) { return true; } return false; }
	 */
}
