package KotlinBasics

fun main(args: Array<String>){
	
	// Create Array with a limit of 5

	var myArray = Array<Int>(5) {0} // Mutable Fixed Size (Fill blank value with 0)
	
	myArray[0] = 32
	myArray[3] = 43
	
	for(element in myArray){		// Using Individual Element (Objects)
		println(element) // Print all elements in Array
	}
	
	println()
	
	// Second Method
	
	for (j in 0..myArray.size - 1){
		// myArray.size = 5
			println(myArray[j])
	}
}