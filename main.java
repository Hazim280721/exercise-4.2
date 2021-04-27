package test;

public class main {

	public static void main(String[] args) {
		Fruit b=new Fruit("Fruit");
        System.out.println(b.name);
        
        
		Apple a=new Apple("Apple","red and green");
		
        System.out.println(a.name);
        System.out.println(a.color);
        
        redApple c=new redApple("red apple","red",2.00,3.00);
        
        System.out.println(c.color);
        System.out.println(c.weight+" KG");
        System.out.println("RM  "+c.price);
        
        greenApple d=new greenApple("green apple","green",2.00,4.00);
        
        System.out.println(d.color);
        System.out.println(d.weight+" KG");
        System.out.println("RM "+d.price);
	}

}
