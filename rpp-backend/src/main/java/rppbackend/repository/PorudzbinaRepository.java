package rppbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rppbackend.model.Porudzbina;

public interface PorudzbinaRepository extends JpaRepository<Porudzbina, Integer>{
	
	List<Porudzbina> findByPlacenoTrue();
		

}