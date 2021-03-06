package com.hscastro.app.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.hscastro.app.entities.Cliente;

@Component
@FeignClient(name = "ms-cad-beneficiario", path = "/clientes")
public interface ClienteFeignClient {
			
	@GetMapping(value = "/{id}")	
	ResponseEntity<Cliente> findById(@PathVariable Long id);
	
	@PostMapping
	ResponseEntity<Cliente> save(Cliente cliente);
	
	@PutMapping
	ResponseEntity<Cliente> update(Cliente cliente);

	@DeleteMapping
	String delete(Long id);
	
	@GetMapping
	List<Cliente> findAll();
	
}
