package kotlin_Class


fun main(args: Array<String>){
	
	// Creating Object of display class
	var dis = display()
	
	// Calling "name" variable of "dispaly" class 
	dis.name = "Steve"
	
	// Concatenation
	println("The name of the person is : ${dis.name}")
	
	// OR
	
	println("The name of the person is : "+ dis.name)
}