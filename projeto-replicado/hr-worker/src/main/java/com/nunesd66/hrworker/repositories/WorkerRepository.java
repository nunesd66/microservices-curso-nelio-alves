package com.nunesd66.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nunesd66.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
