
public class Car {
	float  capacity;
	String modelNumber,brand,speed,mileage;
	double price;
	static int count=0;
	static{
		System.out.println("Ford Motor Company is an American multinational automaker ");
		System.out.println("The company sells automobiles and commercial vehicles under"
				+ " the Ford brand and most luxury cars under the Lincoln brand");
	}
	Car(){
		count++;
	}
	Car(String modelNumber,String brand,double price){
		this.modelNumber=modelNumber;`
		this.brand=brand;
		this.price=price;
		count++;
	}
	Car(String modelNumber,String brand,double price,String speed,float capacity,String mileage){
		this.modelNumber=modelNumber;
		this.brand=brand;
		this.price=price;
		this.speed=speed;
		this.capacity=capacity;
		this.mileage=mileage;
		count++;

	}
	void show(){
		if(modelNumber!=null ){
			System.out.println("Model Number :"+modelNumber);	
		}
		if(brand!=null){
			System.out.println("Brand :"+brand);
		}
		if(price!=0.0){
			System.out.println("Price : "+price);
		}
		if(speed!=null){
			System.out.println("Speed : "+speed);
		}
		if(capacity!=0.0){
			System.out.println("Capacity : "+capacity);
		}
		if(mileage!=null){
			System.out.println("Mileage : "+mileage);
		}
	}
	    
	public static void main(String[] args) {
		Car car1=new Car("2018FIESTA","Ford",1032632.245);
		car1.show();
		Car car2=new Car();	
		car2.modelNumber="2018FOCUS";
		car2.brand="Ford";
		car2.price=1304875.25;
		car2.speed="200 KMPH";
		car2.mileage="16 PL";
		car2.show();
		Car car3=new Car("2018MUSTANG","Ford",1898793.40,"300 KMPH",3.5f,"12 PL");
		car3.show();
		System.out.println("Objects count = "+count);	
	}	
}
