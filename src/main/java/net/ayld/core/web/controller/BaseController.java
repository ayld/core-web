package net.ayld.core.web.controller;

import java.io.Serializable;

import net.ayld.core.dto.Dto;
import net.ayld.core.service.CrudService;

import org.springframework.beans.factory.annotation.Required;

public abstract class BaseController<S extends CrudService<D, I>, D extends Dto<I>, I extends Serializable> {

	private S service;
	
	protected S getService() {
		return service;
	}

	@Required
	public void setService(S service) {
		this.service = service;
	}
}
