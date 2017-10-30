package com.EM2.OnlineShop.dao;

import java.util.List;

import com.EM2.OnlineShop.entity.Category;

public interface CategoryDao {

	List<Category> getCategoryList();

	Category getCategory(int id);

}
