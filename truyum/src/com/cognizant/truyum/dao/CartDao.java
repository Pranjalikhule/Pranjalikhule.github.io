package com.cognizant.truyum.dao;

import com.cognizant.truyum.model.Cart;

public interface CartDao {

	public void addCartItem(long userId, long menuItemId);

	public Cart getAllCartItem(long userId) throws CartEmptyException;

	public void removeCartItem(long userId, long MenuItemId);

}
