package kz.springboot.springbootdemo.repositories;

import kz.springboot.springbootdemo.entities.ShopItems;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ShopItemRepository extends JpaRepository<ShopItems, Long>{

    List<ShopItems> findAllByAmountGreaterThanOrderByPriceDesc(int amount);
    ShopItems findByIdAndAmountGreaterThan(Long id, int amount);


}
