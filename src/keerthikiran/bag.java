package keerthikiran;

public class bag {
	String color;
	int price;
	book b;
	bag(String color,int price)
	{
		this.color=color;
		this.price=price;
		}
	public void getbook() {
		b=new book("gamesthrons",100);
	}
	public void remove()
	{
		b=null;
		System.out.println("removed");
	}

}
