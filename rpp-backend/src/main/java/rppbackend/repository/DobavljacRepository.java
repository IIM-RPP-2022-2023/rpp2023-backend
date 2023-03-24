package rppbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rppbackend.model.Dobavljac;

public interface DobavljacRepository extends JpaRepository<Dobavljac, Integer>{
	
	List<Dobavljac> findByNazivContainingIgnoreCase(String naziv);
}
