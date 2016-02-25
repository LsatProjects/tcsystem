package br.com.lsat.tc.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.lsat.tc.entity.Athlet;
import br.com.lsat.tc.service.AthletService;

@RestController
@RequestMapping("/api/athletes")
public class AthletController {

	@Inject private AthletService athletService;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Athlet> findAll() {
		return athletService.findAll();
	}
}
