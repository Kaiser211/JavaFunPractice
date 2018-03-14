// public class JavaPractice1 {
// 	public void pupAge(){
// 		int age = 0;
// 		age = age + 7;
// 		System.out.println("Puppy age is : " + age);

// 	}
//     public static void main(String[] args) {
// 		JavaPractice1 test = new JavaPractice1();
// 		test.pupAge();
// 	}
// }



//  public class Hello {
// // 	private int age;
// // 	private String name;
// // 	private static int numberOfPeople = 5;

// // 	public Hello(int ageParam, String nameParam) {
// // 		age = ageParam;
// // 		name = nameParam;
// // 		numberOfPeople++;
// // 	}
// // 	 public static int peopleCount() {
// // 	 	return numberOfPeople;
// // 	 }

// // 	public static void main(String[] args) {
// // 		 Hello person1 = new Hello(10, "Person1");
// // 		 Hello person2 = new Hello(5, "Person2");
// // 		 Hello person3 = new Hello(15, "Person3");
// // 		 System.out.println(Hello.peopleCount());
// // 	}
// // }




// // public class Mammal {

// // 	private boolean sleeping = false;
// //     public void regulateTemperature() {
// //         System.out.println("My temperature is just right now.");
// //     }
// //     public void startSleeping() {
// //         sleeping = true;
// //         System.out.println("ZzZz");
// //     }
// //     public boolean isSleeping(){
// //         return sleeping;
// //     }
// // }

// // public class Human extends Mammal {
    
// //     public void goToWork(){
// //         System.out.println("I'm going to work, something only humans can do.");
// //     }
// // }

// // class Hello {
// //     public static void main(String args[]) {
// //         Human h = new Human();
// //         h.regulateTemperature();
// //         h.startSleeping();
// //         h.goToWork();
// //         boolean sleeping = h.isSleeping();
        
// //         if (sleeping){
// //             System.out.println("The human is sleeping!");
// //         }
// //     }
// // }




// // class Hello {
// // 	private int numberOfWheels;
// // 	private Hello(String color) {
// // 		this.color = color;
// // 	}

// // 	public String getColor(){
// // 		return color;
// // 	}
// //     public void setColor(String color){
// //     	this.color = color;
// //     }
// //     public static void main(String[] args) {
// // 	Hello redv = new Hello("red");
// // 	String color = redv.getColor();
// // 	System.out.println("The Vehicle color is: " + color);
// // }

// // }



// // class Vehicle {
// //     private int numberOfWheels;
// //     private String color;
// //     // getter
// //     public int getNumberOfWheels() {
// //         return numberOfWheels;
// //     }
    
// //     // setter
// //     public void setNumberOfWheels(int number) {
// //         numberOfWheels = number;
// //     }
// //     // getter
// //     public String getColor() {
// //         return color;
// //     }
// //     // setter
// //     public void setColor(String color) {
// //         this.color = color;        // 1
// //     }
// // }

// // public class Hello {

// // public static void main(String[] args) {
// //         Vehicle bike = new Vehicle();
// //         Vehicle car = new  Vehicle();
// //         bike.setNumberOfWheels(2);
// //         bike.setColor("red");
// //         int bikeWheels = bike.getNumberOfWheels();
// //         String bikeColor = bike.getColor();
// //         car.setNumberOfWheels(4);
// //         car.setColor("green");
// //         int carWheels = car.getNumberOfWheels();
// //         String carColor = car.getColor();
// //         System.out.println("Bike object - Wheels: " + bikeWheels + ", Color: " + bikeColor);
// //         System.out.println("Car object - Wheels: " + carWheels + ", Color: " + carColor);
// //     }

// // }


// // public class hello {
// // 	public static void main(String[] args) {

// // 		hello b = new hello();
// // 		//b.print1to255();
// // 		//b.printOdd1to255();
// // 		//b.printSumto255();
// // 		b.arrayMax();
		
// // 		}

// // 	public void print1to255() {
// // 		for(int i=1; i < 256; i++) {
// // 			System.out.println(i);
// // }
// // }

//     // public void printOdd1to255(){
//     // 	for( int i=1; i<256; i=i+2){
//     // 		System.out.println(i);
//     // 	}
//     // }
// // 		public void printSumto255(){
// // 	int sum = 0;
// // 	for(int i=0; i<255; i++){
// // 		sum +=i;
// // 		System.out.println("New number: " + i + " Sum: " + sum);
// // 	}
// // }
// // 		public void arrayMax() {
// // 		int [] arr = {-3,-5-7};
// // 		int max = arr[0];
// // 		for (int i =0; i<arr.length; i++) {
// // 			if(arr[i]> max) {
// // 				max = arr[i];
// // 			}
// // 		}
// // 		System.out.println(max);
// // }
// // }
// // import java.util.ArrayList;
// // public class hello {
// // public static void main(String[] args) {

// //    ArrayList<String> dynamicArray = new ArrayList<String>();
// //    dynamicArray.add("Hello");
// //    dynamicArray.add("Kashaer");
// //    dynamicArray.add("Never Give Up Man!");

// //    for(int i = 0; i< dynamicArray.size(); i++){
// //    	System.out.println(dynamicArray.get(i));
// //    }
// // }
// // }

// / 	for( int i = 0; i < 7; i++){
// // 		System.out.println("Happenies");
// // 	}
// // }
// // }
// // // int i = 0;
// // while(i< 7){
    
// //     System.out.println("foo");
// //     i++;
// // }
// // } 
// // }
// // int [] myArray;
// // myArray = new int[5];
// // myArray[0] = 4;
// // myArray[1] = 8;
// // myArray[2] = 9;
// // myArray[3] = 11;
// // myArray[4] = 9;

// // int[] myArray = { 4, 8, 9, 11, 9};


// // import java.util.ArrayList;
// // ArrayList<Integer> myArray = new ArrayList<Integer>();

// // public class hello {
// // 	public String trimAndConcat(String str1, String str2){
// // 		return str1.trim()+ str2.trim();
// // 	}

// // 	public Integer getIndexOrNull(String str, char ch){
// // 		if(str.indexOf(ch)> 0){
// // 			int num1 = str.indexOf(ch);
// // 			return num1;
// // 		}else {
// // 			return null;
// // 		}
// // 	}
// //     public Integer getIndexOrNull(String str2, String str3){
// //     	if(str2.indexOf(str3)> 0) {
// //     		int num1 = str2.indexOf(str3);
// //     		return num1;
// //     	}else {
// //     		return null;
// //     	}
// //     }
// //     public String concatSubstring(String str4, int num4, int num5, String str5){
// //     	String start = str4.substring(num4, num5);
// //     	String end = start.concat(str5);
// //     	return end;
// //     }

// //     public static void main(String[] args) {
    	
// //     	hello id = new hello();
// //     	String value = id.trimAndConcat(" Hello ", " World ");
// //     	System.out.println(value);

// //     	Integer value1 = id.getIndexOrNull("Hello", "H");
// //     	System.out.println(value1);

// //     	Integer value2 = id.getIndexOrNull("Hello", "ell");
// //     	System.out.println(value2);

// //     	String value3 = id.concatSubstring("Hello", 0, 2, "World");
// //     	System.out.println(value3);

// //     }

// // }



// // public class hello {

// // 	public String fizzBuzz(int num){

// // 		if(num %3 == 0 && num % 5 == 0){
// // 			return "FizzBuzz";
// // 		}else if (num % 3 == 0){
// // 			return "Fizz";
// // 		}else if (num % 5 == 0){
// // 			return "Buzz";
// // 		}else {
// // 			return String.valueOf(num);
// // 		}
// // }
	

// // 	public static void main(String[] args) {
	 	
	
// // 		hello id = new hello();
// // 		String value = id.fizzBuzz(25);
// // 		System.out.println(value);
		
// // 	}
// // }



// // import java.lang.Math;
// // public class hello {
// // 	public double calculateHypotenuse(int legA, int legB){
// // 		int legAsq = legA*legA;
// // 		int legBSq = legB*legB;
// // 		int  legCSq = legAsq + legBSq;
// // 		double squareRoot = Math.sqrt(legCSq);

// // 		return squareRoot;


	
// // }
// // 	public static void main(String[] args) {
// // 		hello id = new hello();
// // 		double hypValue = id.calculateHypotenuse(5,5);
// // 		System.out.println(hypValue);
// // 	}


// // }




//  import java.util.Date;
//  public class hello {
// 	public String getCurrentDate(){
// 	 		Date date = new Date();
// 	return "Current date is: " + date;
// 	}

//  	public static void main(String[] args) {
		
//  		hello iD = new hello();
//  		String currentDate = iD.getCurrentDate();

//  		System.out.println(currentDate);
// 	}
	
// 		double d = 35.35;
// 		doublee dd = 35.99;

// 		int i = (int) d;

// 		int ii = (int) dd;
// 		int i = 35;
// 		float f = i;

// 		System.out.println(i);
// 		System.out.println(ii);
// 		System.out.println("The number is: " + f);

		
// 	}
	


// 	