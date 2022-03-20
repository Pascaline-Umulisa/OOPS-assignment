fun main(){
    var me=Human("Pascaline",21,42)
    me.eat(5)
    println(me.weight)
    me.speak("Hello everyone, I am glad to learn kotlin")
    me.birthday()
    var student=detail("Kayitete","Umulisa","kayiteteumulisa@gmail.com","0785638558","Pascaline12345@")
    println(student.phoneNumber)
    println(student.email)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        println("I am eating $foodweight kgs of food")
        weight+=foodweight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
        println(age)
    }
}
data class detail (var firtname:String, var lastname:String,var email:String,var phoneNumber:String, var Password:String){

}
