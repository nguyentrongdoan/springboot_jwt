package com.codegym.repositories;

import com.codegym.entity.DAOUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAORepository extends CrudRepository<DAOUser, Integer> {
    DAOUser findByUsername(String username);
}
