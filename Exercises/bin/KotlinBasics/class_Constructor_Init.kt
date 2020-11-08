package KotlinBasics

fun main(args: Array<String>){
	// Example 1
	var student = Student()
	student.name = "Jordan"
	println("The name of student is ${student.name}")
	
	// Example 2
	var teacher = Teacher("Shinobi")
	println(teacher)
}
// Example 1 Class-Object
class Student{
	var name :String = ""
}

//Example 2 Constructor-With-Paramete
class Teacher (name: String){
	// Create constructor
	init{
		println(" The name of the teacher is $name")
	}
}