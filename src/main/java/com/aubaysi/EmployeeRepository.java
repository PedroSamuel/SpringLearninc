package com.aubaysi;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.aubaysi.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	
	// ao implementar o CrudRepository já tem as funções de sql basica.
	
	public List<Employee> findAllByName(String name); //O spring sozinho, seguindo as convenções percebe o que é que nós pretendemos e 
					// define a query sozinha https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
	
	@Query(nativeQuery = true, value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1") 
	public List<Employee> testeQuery(String name, Pageable pageable /* permite paginação */);
}

