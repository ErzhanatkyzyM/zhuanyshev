package kz.springboot.springbootdemo.services.impl;

import kz.springboot.springbootdemo.entities.Categories;
import kz.springboot.springbootdemo.entities.Countries;
import kz.springboot.springbootdemo.entities.ShopItems;
import kz.springboot.springbootdemo.repositories.CategoryRepository;
import kz.springboot.springbootdemo.repositories.CountryRepository;
import kz.springboot.springbootdemo.repositories.ShopItemRepository;
import kz.springboot.springbootdemo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired private ShopItemRepository shopItemRepository;

    @Autowired private CountryRepository countryRepository;

    @Autowired private CategoryRepository categoryRepository;

    @Override
    public ShopItems addItem(ShopItems item) {
        return shopItemRepository.save(item);
    }

    @Override
    public List<ShopItems> getAllItems() {
        return shopItemRepository.findAllByAmountGreaterThanOrderByPriceDesc(0);
    }

    @Override
    public ShopItems getItem(Long id) {
        return shopItemRepository.findByIdAndAmountGreaterThan(id,0);
    }

    @Override
    public void deleteItem(ShopItems item) {
        shopItemRepository.delete(item);
    }

    @Override
    public ShopItems saveItem(ShopItems item) {
        return shopItemRepository.save(item);
    }

    @Override
    public List<Countries> getAllCountries() {

        return countryRepository.findAll();
    }

    @Override
    public Countries addCountry(Countries country) {

        return countryRepository.save(country);
    }

    @Override
    public Countries saveCountry(Countries country) {

        return countryRepository.save(country);
    }

    @Override
    public Countries getCountry(Long id) {

        return countryRepository.getOne(id);
    }

    @Override
    public List<Categories> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Categories getCategories(Long id) {
        return categoryRepository.getOne(id);
    }

    @Override
    public Categories saveCategories(Categories category) {
        return categoryRepository.save(category);
    }

    @Override
    public Categories addCategory(Categories category) {
        return categoryRepository.save(category);
    }
}
