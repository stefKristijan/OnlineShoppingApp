package com.EM2.OnlineShop.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.EM2.OnlineShop.dao.CategoryDao;
import com.EM2.OnlineShop.entity.Category;

@Repository("categoryDAO")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<>();

	static {

		Category cat1 = new Category(0, "Television", "This is desc for television", "CAT_1.png");
		Category cat2 = new Category(1, "Mobile-phones", "This is desc for cell-phones", "CAT_1.png");
		Category cat3 = new Category(2, "Laptops", "This is desc for laptops", "CAT_1.png");
		Category cat4 = new Category(3, "Personal Computers", "This is desc for PC-s", "CAT_1.png");

		categories.add(cat1);
		categories.add(cat2);
		categories.add(cat3);
		categories.add(cat4);
	}

	@Override
	public List<Category> getCategoryList() {
		return categories;
	}

	@Override
	public Category getCategory(int id) {
		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
