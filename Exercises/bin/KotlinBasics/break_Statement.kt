package KotlinBasics

fun main(args: Array<String>){
	// Labeled Loop

myloop@ for (k in 1..3){
		
		for (l in 1..3){
			
			println("$k $l")
			
			if( k == 2 && l == 2){
				break@myloop // break 1st loop
			}
		}
	}
	
}