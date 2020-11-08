package KotlinBasics

fun main(args: Array<String>){
	
	var myMap = HashMap<Int, String>() 		//	Mutable, READ & WRITE both, No Fixed Size
	
	// Add values to hashmap
	myMap.put(4, "Cena")
	myMap.put(7, "Ronaldo")
	myMap.put(10, "Messi")
	
	
	// Replace Value
	myMap.put(7, "Griezmann")
	
	for ( key in myMap.keys){
		println("Element at key : $key = ${myMap.get(key)}")
	}
}