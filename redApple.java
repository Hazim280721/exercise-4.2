package test;

 class redApple extends Apple {
	double weight;
	double price;
    public redApple(String name,String color,double weight,double price) {
	super(name,color);
	this.weight=weight;
	this.price=weight*3.00;
}
}
