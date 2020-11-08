package KotlinBasics

fun main(args: Array<String>){
	
	// Create "List" of String
	var list = listOf<String>("Mike", "Tyson", "Lesnar") // Immutable, Fixed Size, READ ONLY
	
	for (element in list){	// Using Individual Element (objects)
		println(element)
	}
	
	
	// Second Method
	for (index in 0..list.size - 1){ 	// List .size = 3
		println(list[index]) // Or list.get(index)
	}
}