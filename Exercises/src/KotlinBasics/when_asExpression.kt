package KotlinBasics

fun main(args: Array<String>){
	
	// When as Expression
	
	val x = 1
	
	var str: String = when (x){
								1 -> "x is 1"
								2 -> "x is 2"
								else ->{
									"x value is unknown"
								}
	}
		println(str)
}
