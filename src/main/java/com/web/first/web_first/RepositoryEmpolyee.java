package com.web.first.web_first;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepositoryEmpolyee extends CrudRepository<Employee,Integer> {
    List<Employee> findAllByImie(String imie);
}
