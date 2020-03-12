package IteratorPattern;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ShapeStorage {

	public static void main(String[] args) {
		
		Shape square=new Shape("Square",1);
		Shape rectangle=new Shape("Rectangle",2);
		Shape circle=new Shape("Circle",3);
		Shape triangle=new Shape("Triangle",4);
		
		List<Shape> shapes=new LinkedList<Shape>();
		shapes.add(square);
		shapes.add(rectangle);
		shapes.add(circle);
		shapes.add(triangle);
		
		Iterator iter=shapes.iterator();
		System.out.println("Shapes are :\n");
		while(iter.hasNext())
			System.out.println(((Shape) iter.next()).getShapeName());

	}

}