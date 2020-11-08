package KotlinBasics

fun main(args: Array<String>){
	
	maxNum(8, 12)
}

// Function as Expression
fun maxNum(a: Int, b: Int) : Int
										= if(a < b)
										{
											println("The greater number is $b")
											b
										}
										else{
											println("The greater number is $a")
											a
										}