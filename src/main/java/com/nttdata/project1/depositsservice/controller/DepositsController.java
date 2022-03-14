package com.nttdata.project1.depositsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.web.bind.annotation.DeleteMapping;*/
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.nttdata.project1.depositsservice.entity.Deposit;
import com.nttdata.project1.depositsservice.service.DepositService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/deposits")
public class DepositsController {

	@Autowired
	private DepositService service ;
	
	@GetMapping("/{account}")
	public Flux<Deposit> getAll(@PathVariable("account") String account){
		return service.findAll();
	}
	
	@GetMapping("/{account}/{deposit}")
	public Mono<Deposit> findByid(@PathVariable("account") String account,@PathVariable("deposit") String deposit){
		return null;
	}
	
	@PostMapping("/{account}")
	public Mono<Deposit> create(@RequestBody Deposit deposit, @PathVariable("account") String account){
		deposit.setIdAccount(account);
		deposit.setActive(true);
		return service.save(deposit);
	}
	
	@PutMapping("/{account}")
	public Mono<Deposit> update(@RequestBody Deposit deposit, @PathVariable("account") String account ){
		deposit.setIdAccount(account);
		deposit.setActive(true);
		return service.update(deposit);
	}
	
	/*@DeleteMapping("/{id}")
	public Mono<Void> deleteById(@PathVariable("id") String id){
	  return null;
	}*/
	
	
	
	
	
}
