package KotlinBasics

fun main(args: Array<String>){
	
	// Create "List" of String
//	var list = ArrayList<String>("Mike", "Tyson", "Lesnar")
//	var list = arrayListOf<String>("Mike", "Tyson", "Lesnar")
	var list =	mutableListOf<String>("Mike", "Tyson", "Lesnar")
	// Mutable, No Fixed Size, Can Add or Remove Elements
	
	// Add new elements in "List"
	list.add("Cena")
	list.add("Shawn")
	list.add("Rollin")
	
	// Remove 2nd element
	list.remove("Tyson")
	
	// Add new element on 1st index
	list.add(1, "Mcgregor")
	
	// Replace element
	list[2] = "Mysterio"
	
	for (element in list){	// Using Individual Element (objects)
		println(element)
	}
	
	println()
	
	// Second Method
	for (index in 0..list.size - 1){ 	// List .size = 3
		println(list[index]) // Or list.get(index)
	}
}