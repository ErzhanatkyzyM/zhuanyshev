package kz.springboot.springbootdemo.repositories;

import kz.springboot.springbootdemo.entities.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface CountryRepository extends JpaRepository<Countries, Long> {



}
