package br.com.lsat.tc.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import br.com.lsat.tc.entity.Athlet;
import br.com.lsat.tc.repository.AthletRepository;

@Service
@Transactional
public class AthletService {

	@Inject private AthletRepository athletRepository;
	
	public List<Athlet> findAll() {		
		return athletRepository.findAll();
	}

}
