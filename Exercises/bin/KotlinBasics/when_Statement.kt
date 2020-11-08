package KotlinBasics

fun main(args: Array<String>){
	
	// WHEN STATEMENT
	
	val a = 10
	
	when (a){
		
		1 -> println("a is 1")
		 2-> println("a is 2")
		// Multiple Conditions in "When Statement"
		3, 4, 5 -> {
			println("a is 3 OR 4 OR 5")
		}
		// Search in "range"
		in 15..20 -> {
			println("a is between 15 to 20")
		}
		
		else -> {
			// Curly braces are not necessary for single line code
			println("a value is unknown")
			println("I don't know the value of a")
		}
	}
	
	
}