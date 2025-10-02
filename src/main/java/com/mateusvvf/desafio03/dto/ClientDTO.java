package com.mateusvvf.desafio03.dto;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;

import com.mateusvvf.desafio03.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {
	
	
	private Long id;
	
	@NotBlank(message = "Name cannot be blank.")
	private String name;
	
	private String cpf;
	private Double income;
	
	@PastOrPresent(message = "Birth date cannot be a future date.")
	private LocalDate birthDate;
	
	private Integer children;
	
	
	public ClientDTO() {
		
	}


	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	
	public ClientDTO(Client client) {
		BeanUtils.copyProperties(client, this);
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public Double getIncome() {
		return income;
	}


	public void setIncome(Double income) {
		this.income = income;
	}


	public LocalDate getBirthDate() {
		return birthDate;
	}


	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}


	public Integer getChildren() {
		return children;
	}


	public void setChildren(Integer children) {
		this.children = children;
	}

}
