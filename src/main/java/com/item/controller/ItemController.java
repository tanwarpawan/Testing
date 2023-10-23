package com.item.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.item.exception.ItemService;
import com.item.model.Item;

@RestController
public class ItemController {

	@Autowired
	ItemService itemService;
	
	@PostMapping("/item")
	public Item addItems(@RequestBody Item item)
	{
		return itemService.additems(item);
		
	}
	
	@GetMapping("/item/item")
	public List<Item> getItems()
	{
		return itemService.getItems();
		
	}
	
	@GetMapping("/item/{itemid}")
	public Item getItem(@PathVariable String itemid)
	{
		return itemService.getItem(itemid);
		
	}
	
	@PutMapping("/item/item")
	public Item updateItems(@RequestBody Item item)
	{
		return itemService.updateditems(item);
		
	}
	
	@DeleteMapping("/item/item")
	public ResponseEntity<HttpStatus> deleteitem(@RequestBody Item item)
	{
		try {
			this.itemService.deleteitem(item);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
		
	}
}
