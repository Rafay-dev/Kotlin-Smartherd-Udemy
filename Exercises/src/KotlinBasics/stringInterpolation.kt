package KotlinBasics

fun main(args: Array<String>){
	
	// String Templates: Interpolation
	
	
	val name : String
	name = "Sid"
	
	// String Concatenation
	
	println("Nice to meet you " + name) 
	
	// String Interpolation
	
	println("Nice to meet you $name")
	
	// OR
	
	println("The length of name string is ${name.length}")
	
	// Curly Braces are used to apply the interpolation on whole condition, otherwise it won't work.

	// 2nd Condition
	
	val a = 5
	val b = 10
	
	println("The sum of $a + $b = ${a+b}")
	
	
	// Print the length and breadth and Area of Rectangle
	
	val rect = Rectangle()

	println("The length of Rectangle is ${rect.length} and the breadth is ${rect.breadth}. The 	Area of Rectangle is ${rect.length * rect.breadth}")
}

class Rectangle{
	var length : Int = 8
	var breadth : Int = 5
}