package com.HospitalMangagmentSystem.demo.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.HospitalMangagmentSystem.demo.domain.Patients;

	@Repository
	public interface PatientRepository extends JpaRepository<Patients,Integer>{

	}


