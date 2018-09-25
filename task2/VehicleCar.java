package task2;

import java.math.BigDecimal;
import java.util.ArrayList;

public class VehicleCar extends Pojo{
	
	int Price;
	static double c;
	Boolean d = false;
	public static void main(String[] args) {
		ArrayList<VehicleCar> al=new ArrayList<VehicleCar>();
		VehicleCar vc = new VehicleCar();
		VehicleCar vc1 = new VehicleCar();
		VehicleCar vc2 = new VehicleCar();
		vc.setModelNumber("2018FIESTA"); 
		vc.setBrand("Ford");
		vc.setMileage("16 PL"); 
		vc.setCapacity(56.54f);
		vc.setSpeed("200 KMPH"); 
		vc.setPrice(10326);
		vc1.setModelNumber("2018FOCUS"); 
		vc1.setBrand("Ford");
		vc1.setMileage("16 PL"); 
		vc1.setCapacity(20.54f);
		vc1.setSpeed("250 KMPH"); 
		vc1.setPrice(18987);
		vc2.setModelNumber("2018MUSTANG"); 
		vc2.setBrand("Ford");
		vc2.setMileage("16 PL"); 
		vc2.setCapacity(20.54f);
		vc2.setSpeed("300 KMPH"); 
		vc2.setPrice(13048);
		al.add(vc);
		al.add(vc1);
		al.add(vc2);
		for(VehicleCar v:al){
			System.out.println("Model Number : " + v.getModelNumber() + ", Brand : " + v.getBrand() + ", Price : "
			+ v.getPrice() + ", Speed : " + v.getSpeed() + ", Mileage : " + v.getMileage() + ",Capacity : "
			+ v.getCapacity());
		}
		double val = (vc.getPrice() > vc1.getPrice()) ? ((vc.getPrice() > vc2.getPrice()) ? vc.getPrice() : vc2.getPrice())
				: ((vc1.getPrice() > vc2.getPrice()) ? vc1.getPrice() : vc2.getPrice());
		System.out.println("ternary operator example value " + val);
		c = vc.getPrice() + vc1.getPrice();
		//Arithmetic Operators
		System.out.println("Arithmetic Operators are, ");
		System.out.println("a+b=" + c);
		c = vc.getPrice() - vc1.getPrice();
		System.out.println("a-b=" + c);
		c = vc.getPrice() / vc1.getPrice();
		System.out.println("a/b=" + c);
		c = vc.getPrice() % vc1.getPrice();
		System.out.println("a%b=" + c);
		c = vc.getPrice() * vc1.getPrice();
		System.out.println("a*b=" + c);
		//Relational Operators
		System.out.println("Relational Operators are,");
		StringBuilder sb = new StringBuilder(vc1.getModelNumber());
		StringBuilder sb1 = new StringBuilder(vc.getModelNumber());
		System.out.println("Appending two Model Numbers : " + sb.append(sb1));
//		String s = sb.toString();
//		String s1 = sb.toString();
		if (sb == sb1) {
			System.out.println("two model numbers are equal ");
		} else {
			System.out.println("Two Model Numbers are not equal");
		}
		if (vc.getPrice() != vc1.getPrice()) {
			System.out.println("not equal ");
		} else if (vc.getPrice() > vc1.getPrice() || vc2.getPrice() >= vc.getPrice()) {
			System.out.println("greater and greater than or equal to(logical ||)");
		}
		else if (vc.getPrice() < vc1.getPrice() && vc2.getPrice() <= vc.getPrice()) {
			System.out.println("lessthan and lessthan than or equal to (logical &&)");
		} else if (!(vc.getPrice() == vc1.getPrice())) {
			System.out.println("not lessthan than or equal(Logical !)");
		} else {
			System.out.println("All conditions are failed");
		}
		System.out.println("vc instanceof VehicleCar : "+(vc instanceof VehicleCar));
		System.out.println("vc1 instanceof VehicleCar : "+(vc1 instanceof VehicleCar));
		System.out.println("vc2 instanceof VehicleCar : "+(vc2 instanceof VehicleCar));

		}

}
