package com.example.traveloffice.projekt.demo.hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers")
public interface PersonRepository extends PagingAndSortingRepository<Customer, Long> {

	List<Customer> findByName(@Param("name") String name);

}
