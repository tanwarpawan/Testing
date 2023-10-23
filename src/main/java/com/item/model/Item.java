package com.item.model;

public class Item {
 
	    private String id;
	    private String name;
	    private String desc;
	    private double price;
	    
		public Item() {
			super();	
		}
		

		public Item(String id, String name, String desc, double price) {
			super();
			this.id = id;
			this.name = name;
			this.desc = desc;
			this.price = price;
		}


		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}


		@Override
		public String toString() {
			return "Item [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
		}
		
		
	    
	    
}
