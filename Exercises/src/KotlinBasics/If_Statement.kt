package KotlinBasics

fun main(args: Array<String>){
	
	val a = 5
	val b = 10
	
	// IF as Expresssion
	
	var maxValue: Int = if(a > b){
									println("a is greater: ")	
									a // return a
									}
										else{
									println("b is greater: ")
											b // return b
									}
	
	// As per the rule the last statement defined in "If" condition will be 'return'
	
	println("The maximum value is $maxValue") 
}