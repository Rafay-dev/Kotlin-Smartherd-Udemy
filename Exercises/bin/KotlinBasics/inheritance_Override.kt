package KotlinBasics

fun main(args: Array<String>){
	println("MESSI")
	var Barca = Messi()
		println("Shirt Number = ${Barca.shirtNo}")
			Barca.Data()
	println()
	
	println("RONALDO")
	var madrid = Ronaldo()
		println("Shirt Number = ${madrid.shirtNo}")
		madrid.Data()
}

open class Footballer(){
	open var shirtNo:Int = 4
	
	open fun Data(){
	var skills = mapOf<String, Int>	("Pass" to 0, "Shoot" to 0, "Dribble" to 0)
			for (key in skills.keys){
				println("$key = ${skills.get(key)}")
			}
	}
}
	
class Ronaldo : Footballer(){
		override var shirtNo = 7
				
	override fun Data(){
			var skills = mapOf<String, Int>	("Pass" to 95, "Shoot" to 99, "Dribble" to 97)
			for (key in skills.keys){
				println("$key = ${skills.get(key)}")
			}
	}
}
	
class Messi : Footballer(){
	
	override var shirtNo = 10
				
	override fun Data(){
			var skills = mapOf<String, Int>	("Pass" to 97, "Shoot" to 98, "Dribble" to 98)
			for (key in skills.keys){
				println("$key =  ${skills.get(key)}")
			}
	}
}
