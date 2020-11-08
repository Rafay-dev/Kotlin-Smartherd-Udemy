package KotlinBasics

fun main(args: Array<String>){
	
	// Example 1
		add(2,4)
		
	// Example 2
		sub()
	
	// Example 3
	var multi = mul(2, 7)
	println("Multiplacation of e and f is ${multi}")
}

// Example 1
fun add(a: Int, b: Int){
	println("The sum of a & b is ${a + b}")
}

// Example 2

fun sub(){
	var c = 8
	var d = 4
	
	println("Substraction of c from d is ${c-d}")
}

// Example 3

fun mul(e: Int, f: Int): Int{
	return e * f
}

