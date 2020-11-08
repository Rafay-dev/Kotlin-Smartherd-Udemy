package KotlinBasics

fun main(args: Array<String>){
	
	// Create Dog Object
	var dogg  = Dog()
	// Inherit Animal Class Properties in Dog Class
	dogg.color = "labra"
	dogg.eat()
	
	// Create Cat Object
	var catt  = Cat()
	// Inherit Animal Class Properties in Dog Class
	catt.color = "brown"
	catt.eat()
	
}

open class Animal{
	
	var color: String = ""
	
	fun eat(){
		println("eat")
	}
}

class Dog : Animal(){
	
	var breed: String = ""
	
	fun bark(){
		println("bark")
	}
}

class Cat() : Animal(){
	
	var age:Int = -1
	
	fun meow(){
		println("meow")
	}
}