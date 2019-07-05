package com.bit.web.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.bit.web.domain.CustomerDTO;
import com.bit.web.entities.Customer;
import com.bit.web.repositories.CustomerRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * CustomerService
 */
@Service
public class CustomerService {

	@Autowired CustomerRepository customerRepository;
	@Autowired CustomerDTO customerDTO;
	@Autowired ModelMapper modelMapper;

	public long count(){
		return customerRepository.count();
	}
	
	public void delete(Customer entity){
		customerRepository.delete(entity);
	}
	
	public void deleteAll(){
		customerRepository.deleteAll();
	}
	
	public void deleteAll(Iterable<Customer> entities){
		customerRepository.deleteAll(entities);	
	}
	
	public void deleteById(Long id){
		customerRepository.deleteById(id);
	}
	//문자열 ID 삭제
	public void deleteById(String id){
		customerRepository.deleteById(id);
	}
	
	public boolean existsById(Long id){
		return customerRepository.existsById(id);
	}
	
	public List<CustomerDTO> findAll(){
		//CustomerDTO customerDTO = modelMapper.map(list, CustomerDTO.class);
		Iterable<Customer> entities = customerRepository.findAll();
		List<CustomerDTO> list = new ArrayList<>();
		for(Customer s : entities){
			customerDTO = modelMapper.map(s, CustomerDTO.class);
			list.add(customerDTO);
		}
		return list;
	}
	
	public Iterable<Customer> findAllById(Iterable<Long> ids){
		return customerRepository.findAllById(ids);
	}
	
	public Optional<Customer> findById(Long id){
		return customerRepository.findById(id);
	}

	public CustomerDTO findByCustomerId(String id){
		Optional<Customer> oCustomer = customerRepository.findByCustomerId(id);
		customerDTO = modelMapper.map(oCustomer.get(), CustomerDTO.class);
		System.out.println(customerDTO.getCustomerId());
/* 		customerDTO = modelMapper.map(oCustomer.orElseThrow(EntityNotFoundException::new), CustomerDTO.class);
		System.out.println(customerDTO.getCustomerId()); */
		return customerDTO;
	}
	
	public void save(CustomerDTO dto){
/* 		Customer entity = modelMapper.map(dto, Customer.class);
		System.out.println("엔티티 변환" + entity); */
		Customer entity = Customer.builder()
									.customerId(dto.getCustomerId())
									.customerName(dto.getCustomerName())
									.password(dto.getPassword())
									.ssn(dto.getSsn())
									.phone(dto.getPhone())
									.city(dto.getCity())
									.address(dto.getAddress())
									.postalcode(dto.getPostalcode())
									.photo(dto.getPhoto())
									.build();
		customerRepository.save(entity);
	}
	
	public Iterable<Customer> saveAll(Iterable<Customer> entities){
		return customerRepository.saveAll(entities);
	}

	public CustomerDTO login(String customerId, String password){
		//customerDTO = modelMapper.map(customerRepository.findByCustomerIdAndPassword(customerId, password), CustomerDTO.class);
		return customerDTO;
	}
}