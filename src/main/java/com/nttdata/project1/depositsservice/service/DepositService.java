package com.nttdata.project1.depositsservice.service;


import com.nttdata.project1.depositsservice.entity.Deposit;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface DepositService {
	
	Flux<Deposit> findAll();
	Mono<Deposit> save(Deposit deposit);
	Mono<Deposit> update(Deposit deposit);
    
    
}
