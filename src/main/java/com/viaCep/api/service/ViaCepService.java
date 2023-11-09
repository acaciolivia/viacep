package com.viaCep.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.viaCep.api.model.CepResponse;

@Service
public class ViaCepService {

	private static final String VIA_CEP_URL = "https://viacep.com.br/ws/";
	
	@Autowired
	private RestTemplate restTemplate;
	
	public CepResponse consultarCep(String cep) {
		String url = VIA_CEP_URL + cep + "/json";
		return restTemplate.getForObject(url,CepResponse.class);
	}
}
