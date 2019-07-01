package com.bit.web.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.bit.web.common.util.PageProxy;
import com.bit.web.common.util.Printer;
import com.bit.web.domain.CustomerDTO;
import com.bit.web.entities.Customer;
import com.bit.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CustomerController
 */
@RestController
@RequestMapping("/customers")
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
public class CustomerController {
        
    @Autowired CustomerService customerService;
    @Autowired CustomerDTO customer;
    @Autowired PageProxy pxy;
    @Autowired Printer p;

    @GetMapping("/count")
    public long count(){
		return customerService.count();
	}
    
/*     @DeleteMapping("/{id}")
	public void delete(CustomerDTO dto){
		customerService.delete(null);
	}
    
    @DeleteMapping("")
	public void deleteAll(){
		customerService.deleteAll();
	}
    
    @DeleteMapping("")
	public void deleteAll(Iterable<Customer> entities){
		customerService.deleteAll(entities);	
	} */
    
    @DeleteMapping("/{id}")
	public void deleteById(String id){
		customerService.deleteById(id);
	}
    
    @GetMapping("/exists/{id}")
	public boolean existsById(@PathVariable String id){
		Long longId = Long.parseLong(id);
		return customerService.existsById(longId);
	}
    
	@GetMapping("")
	public List<CustomerDTO> findAll(){
		return customerService.findAll();
	}
    
/*     @GetMapping("/{id}")
	public Iterable<Customer> findAllById(Iterable<Long> ids){
		return customerService.findAllById(ids);
	} */
    
/*     @GetMapping("/{id}")
	public CustomerDTO findById(Long id){
        Optional<Customer> a = customerService.findById(id);
		return null;
    } */
    
    @GetMapping("/{id}")
	public CustomerDTO findByCustomerId(@PathVariable String id){
		customer = customerService.findByCustomerId(id);
		return customer;
	}
    
    @PostMapping("")
	public HashMap<String, String> save(@RequestBody CustomerDTO dto){
		HashMap<String, String> map = new HashMap<>();
/* 		Customer entity = modelMapper.map(dto, Customer.class); */
		customerService.save(dto);
		map.put("result", "SUCCESS");
		return map;
	}
    
/*     @PostMapping("")
	public Iterable<CustomerDTO> saveAll(Iterable<CustomerDTO> dtos){
        Iterable<Customer> entities = customerService.saveAll(null);
		return null;
	} */

/* 	@GetMapping("/login")
	public HashMap<String, String> login(@RequestBody CustomerDTO dto){
		System.out.println("컨트롤러 진입");
		HashMap<String, String> map = new HashMap<>();
		if(customerService.login(dto) != null){
			map.put("result", "SUCCESS");
		}else{
			map.put("result", "FALSE");
		}
		System.out.println("컨트롤러 아웃");
		return map;
	} */
	@GetMapping("/login")
	public String login(@RequestBody CustomerDTO dto){
		System.out.println("컨트롤러 진입");
		System.out.println(dto);
		return "1";
	}
}