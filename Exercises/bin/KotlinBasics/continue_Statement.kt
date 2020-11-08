package KotlinBasics

fun main(args: Array<String>){
// Print Odd Numbers Using Continue Statement
	
	for(i in 1..10){
		if(i%2==0){
			continue
		}
		println(i)
	}
	// Continue Statement with Labeled Loop (NESTED LOOP)
	
	for(a in 1..3){
		for (b in 1..3){
			
			if(a == 2 && b == 2){
				continue // Skip 2 2
			}
			println("$a $b")
		}
	}
}