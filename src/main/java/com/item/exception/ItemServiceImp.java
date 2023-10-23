package com.item.exception;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.item.model.Item;

@Service
public class ItemServiceImp implements ItemService{

	List<Item> list;
	
	public ItemServiceImp()
	{
		list = new ArrayList<>();
		list.add(new Item("1","AC","Electronic device",20.90));
		list.add(new Item("2","TV","Electronic device",45.90));
		list.add(new Item("3","fan","Electronic device",28.90));
		
	}
	
	@Override
	public Item additems(Item item) {
		
		list.add(item);
		return item;
	}
	@Override
	public List<Item> getItems() {
		
		return list;
	}
	
	@Override
	public Item getItem(String itemid) {
		Item itm = null ;
		for(Item item : list){
			if(item.getId().equalsIgnoreCase(itemid)){
				itm = item;
				break;
				
			}
		
		}
	//	System.out.println("item " +itm);
		return itm;
	}

	@Override
	public Item updateditems(Item item) {
		
		list.forEach(e ->
		{
			if(e.getId() == item.getId())
			{
				e.setId(item.getId());
				e.setName(item.getName());
				e.setDesc(item.getDesc());
				e.setPrice(item.getPrice());
			}
		});
		return item;
	}
	@Override
	public void deleteitem(Item item) {
		list.removeAll(list);
	}

	
	

}
