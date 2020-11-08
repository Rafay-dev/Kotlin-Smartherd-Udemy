package KotlinBasics

fun main(args: Array<String>){
	
		// Creating Object
	var personObj = person()

		// Accessing Variable from Class
			personObj.name = "Steve"
		
	// Accessing function from Class
	personObj.display(personObj.name)
	
}

class person{
	
	// Creating String Variable
	var name:String =""
	
	fun display(name: String){
		print(name)
	}
	
	/* You can remove "name:String" from 'display' parantheses and "person.Obj.name" from 
	"personObj.display" parantheses */
 }