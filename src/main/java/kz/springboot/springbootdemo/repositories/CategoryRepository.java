package kz.springboot.springbootdemo.repositories;
import kz.springboot.springbootdemo.entities.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional

public interface CategoryRepository extends JpaRepository <Categories, Long>{
}
