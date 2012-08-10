package net.ayld.core.web.controller;

import org.springframework.beans.factory.annotation.Required;

public abstract class BaseController<S> {

	private S service;
	
	protected S getService() {
		return service;
	}

	@Required
	public void setService(S service) {
		this.service = service;
	}
}
