fun main(args: Array<String>) {
	//Var keyword is used to declare a variable when you want to change the variable value multiple times in program example counter variables
	var count = 1

	println(count)
	count++
	println(count)
	count = 9
	println(count)

	//Val keyword is used to declare a variable when you do not want to change the variable value it should be constant all the time
	val count2 = 0
	//below lines will throw error
	//count2++
	//count2=21

	println(count2)

	//Variable using val can be assigned later but once assgined value it is than constant througout the program
	val name: String
	name = "Vaibhav Mojidra"
	//name="Riya Mojidra"
	println(name)
}