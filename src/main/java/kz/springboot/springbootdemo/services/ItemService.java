package kz.springboot.springbootdemo.services;


import kz.springboot.springbootdemo.entities.Categories;
import kz.springboot.springbootdemo.entities.Countries;
import kz.springboot.springbootdemo.entities.ShopItems;

import java.util.List;

public interface ItemService {

    ShopItems addItem(ShopItems items);
    List<ShopItems> getAllItems();
    ShopItems getItem(Long id);
    void deleteItem(ShopItems items);
    ShopItems saveItem(ShopItems items);

    List<Countries> getAllCountries();
    Countries addCountry(Countries country);
    Countries saveCountry(Countries country);
    Countries getCountry(Long id);

    List<Categories> getAllCategories();
    Categories getCategories(Long id);
    Categories saveCategories(Categories category);
    Categories addCategory(Categories category);



}
