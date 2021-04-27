package test;

 class greenApple extends Apple{

	double price;
	 double weight;
	public greenApple(String name,String color,double weight,double price) {
	super(name,color);
	this.weight=weight;
	this.price=weight*4.00;
	
}
}