package com.codegym.cms.repository;

import com.codegym.cms.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IUserRepository extends CrudRepository<User, Long> {
}