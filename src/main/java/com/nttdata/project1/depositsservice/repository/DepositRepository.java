package com.nttdata.project1.depositsservice.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.nttdata.project1.depositsservice.entity.Deposit;

public interface DepositRepository extends ReactiveMongoRepository<Deposit, String>{

}
