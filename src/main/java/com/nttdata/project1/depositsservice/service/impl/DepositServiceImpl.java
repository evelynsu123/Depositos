package com.nttdata.project1.depositsservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.project1.depositsservice.entity.Deposit;
import com.nttdata.project1.depositsservice.repository.DepositRepository;
import com.nttdata.project1.depositsservice.service.DepositService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class DepositServiceImpl implements DepositService{
 
	@Autowired
	private DepositRepository repository;
	
	@Override
	public Flux<Deposit> findAll() {
		
		return repository.findAll() ;
	}

	@Override
	public Mono<Deposit> save(Deposit deposit) {
		
		return repository.save(deposit);
	}

	@Override
	public Mono<Deposit> update(Deposit deposit) {
		
		return repository.save(deposit);
	}

}
