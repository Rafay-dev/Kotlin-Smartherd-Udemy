package KotlinBasics

fun main(args: Array<String>){
	
	var largeValue = max(8, 12)
	 
	println("The greater number is $largeValue")
	
}

fun max(a: Int, b: Int) : Int{
	
	if(a < b){
		return b
	}
	else{
		return a
	}
	
}