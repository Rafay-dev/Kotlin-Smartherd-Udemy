package KotlinBasics

fun main(args: Array<String>){
	
	// Define a map of "Integer" & "String"
	
	// Immutable, Fixed Size, Read Only
	// Map Example : Key-Value Pair
	var myMap = mapOf<Int, String>( 4 to "Cena,", 7 to "Ronaldo", 10 to "Messi" ) 		
	
	// Print all "Keys" of "myMap"
			for ( key in  myMap.keys){
		//		println(myMap[key])		// Or 	println(myMap.get(key))
			
				// OR
				println("Element at key: $key = ${myMap.get(key)}")
			}
	
}
