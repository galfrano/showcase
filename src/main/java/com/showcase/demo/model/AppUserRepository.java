package com.showcase.demo.model;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface AppUserRepository extends CrudRepository<AppUser, Long> {

    List<AppUser> findByUserName(String userName);

    AppUser findById(long id);
}