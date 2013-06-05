/* COPYRIGHT (C) 2013 Puncak Tegap Sdn Bhd. All Rights Reserved. */

package com.ptsb.tutorial.tutorialspringhibernate.web.form;

import java.io.Serializable;

import javax.annotation.PostConstruct;

/**
 * @author Nicholas
 */
public abstract class BaseForm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@PostConstruct
	public void init() {
	}

}
