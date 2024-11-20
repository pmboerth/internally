package com.internally.backend.repositories;

import com.internally.backend.models.Company;
import org.springframework.data.repository.CrudRepository;

public interface CompanyRepository extends CrudRepository<Company, Long> {

}
