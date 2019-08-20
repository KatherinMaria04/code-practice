package com.revature.Day4;

public class Book {
	public String name;
	private Integer price;
	public String authorname;
	public Book() {
		
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public int getPrice() {
		return price;
	}
	public Book(String name,Integer price,String authorname) {
		this.name=name;
		this.price=price;
		this.authorname=authorname;
		}
	////to reuse multipe time the S.O.P
	public String toString() {
		// return ("title:" + this.name + ",price:" + getPrice() + ", authorname:" + this.authorname);
		// instead of using reture other way to use is append using string bulider
		StringBuilder content= new StringBuilder();
		content.append("[");
        content.append("title:").append(this.name).append(",");
        content.append("price:").append(this.price).append(",");
        content.append("authorName:").append(this.authorname);
        content.append("]");
        return content.toString();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorname == null) ? 0 : authorname.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (authorname == null) {
			if (other.authorname != null)
				return false;
		} else if (!authorname.equals(other.authorname))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	
	
	

}
