package com.item.exception;

import java.util.List;

import com.item.model.Item;

public interface ItemService {
   
	public List<Item> getItems();

	public Item getItem(String itemid);

	public Item additems(Item item);

	public Item updateditems(Item item);

	public void deleteitem(Item item);

	
}
