package com.viaCep.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import com.viaCep.api.model.CepResponse;
import com.viaCep.api.service.ViaCepService;

@Controller
public class ViaCepController {

	@Autowired
	private ViaCepService viaCepService;
	
	public CepResponse consultarCep(@PathVariable String cep) {
		return viaCepService.consultarCep(cep);
	}
}
