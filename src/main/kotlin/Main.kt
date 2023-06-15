fun main(){
var product=Product("sugar",200.0,2.0)
println(product.totalPrice(200.0,2.0))
val product1=Product("rice",180.0,1.0)
println(product1.totalPrice(180.0,2.0))

val product2=Product("flour",250.0,2.0)
println(product.totalPrice(250.0,2.0))

val product3=Product("apple",300.0,5.0)
println(product3.totalPrice(300.0,5.0))

val product4=Product("salt",100.0,3.0)
println(product4.totalPrice(200.0,2.0))

val product5=Product("milk",400.0,6.0)
println(product5.totalPrice(400.0,6.0))

val product6=Product("chair",1200.0,2.0)
println(product6.totalPrice(1200.0,2.0))

val product7=Product("vegetables",250.0,12.0)
println(product7.totalPrice(250.0,12.0))

val product8=Product("clothes",2000.0,2.0)
println(product8.totalPrice(2000.0,2.0))


var x= mutableListOf(product,product1,product2,product3,product4,product5,product6,product7,product8)
//    println(x.total)
//    println(x.totalPrice)

val student=Student("Faith Mwangi",17,57)
println( student.getAverage(8,57))

val student1=Student("Faith Mwangi",17,70)
println( student1.getAverage(8,70))

val student2=Student("Faith Mwangi",17,54)
println( student.getAverage(8,57))

val student3=Student("Faith Mwangi",17,37)
println( student.getAverage(8,37))

val student4=Student("Faith Mwangi",17,50)
println( student4.getAverage(6,50))

val student5=Student("Faith Mwangi",17,57)
println( student5.getAverage(8,57))

val student6=Student("Faith Mwangi",17,47)
println( student6.getAverage(8,47))

val student7=Student("Faith Mwangi",17,40)
println( student7.getAverage(8,40))

val student8=Student("Faith Mwangi",17,90)
println( student8.getAverage(8,90))

val student9=Student("Faith Mwangi",17,77)
println( student9.getAverage(8,77))

val student10=Student("Faith Mwangi",17,87)
println( student10.getAverage(5,87))


val y= mutableListOf(student,student1,student2,student3,student4,student5,student6,student7,student8,student9,student10)
//    println(y.average)
//    y.getAvarage


}

//1.**Ancestral Stories:** In many African cultures, the art of storytelling is passed
//down from generation to generation. Imagine you're creating an application that
//records these oral stories and translates them into different languages. The
//stories vary by length, moral lessons, and the age group they are intended for.
//Think about how you would model `Story`, `StoryTeller`, and `Translator`
//objects, and how inheritance might come into play if there are different types of
//stories or storytellers.


//Psudo Code
//Create a class eg.class Ancestral_Stories, add a constructor cointaining the attributes
// then create the methods that will help you in knowing the age group and the story
//the storyTeller and translator based on the age group.

//class Ancestral_Stories(var name:String,var StoryTeller:String,var Translator:String){
//    fun getTranslation(name:String,storyTeller:String,Translator:String,age:Int):String{
//        while (age; 0..10)
//    }
//}

//2. **African Cuisine:** You're creating a recipe app specifically for African cuisine.
//The app needs to handle recipes from different African countries, each with its
//unique ingredients, preparation time, cooking method, and nutritional
//information. Consider creating a `Recipe` class, and think about how you might
//create subclasses for different types of recipes (e.g., `MoroccanRecipe`,
//`EthiopianRecipe`, `NigerianRecipe`), each with their own unique properties and
//methods.

//3. **Wildlife Preservation:** You're a wildlife conservationist working on a
//program to track different species in a national park. Each species has its own
//characteristics and behaviors, such as its diet, typical lifespan, migration
//patterns, etc. Some species might be predators, others prey. You'll need to
//create classes to model `Species`, `Predator`, `Prey`, etc., and think about how
//these classes might relate to each other through inheritance.

//4. **African Music Festival:** You're in charge of organizing a Pan-African music
//festival. Many artists from different countries, each with their own musical style
//and instruments, are scheduled to perform. You need to write a program to
//manage the festival lineup, schedule, and stage arrangements. Think about how
//you might model the `Artist`, `Performance`, and `Stage` classes, and consider
//how you might use inheritance if there are different types of performances or
//stages.


//5. Create a class called Product with attributes for name, price, and quantity.
//Implement a method to calculate the total value of the product (price * quantity).
//Create multiple objects of the Product class and calculate their total values.

open class Product (var name:String,var price:Double,var quantity:Double){
    fun totalPrice(price: Double,quantity: Double):Double{
        var total=price*quantity
        return total
    }
}

//6. Implement a class called Student with attributes for name, age, and grades (a
//list of integers). Include methods to calculate the average grade, display the
//student information, and determine if the student has passed (average grade >=
//60). Create objects for the Student class and demonstrate the usage of these
//methods.

//"Psudo Code"
//create a class Strudent with the attriutes name age and grades.create methods that will help you know if the
//student has passed or not and a method for calculating the total grades a student has to determine whether
//one has passed or not.

open class Student(var name:String,var age:Int,var grades:Int){
    var average=50
    fun getPassmark(name: String,age: Int,grades: Int):String{
        if (grades <= average){
            return "the student has failed"
        }
        else if(grades >average && grades==75){
            return "the student has done good"
        }
        else{
            return "the student has done excellent"
        }
    }

    fun getAverage(subjects:Int,grades: Int){
        average=grades%subjects
    }
}

//7. Create a FlightBooking class that represents a flight booking system. Implement
//methods to search for available flights based on destination and date, reserve
//seats for customers, manage passenger information, and generate booking
//confirmations.

class  FlightBooking

//8. Create a LibraryCatalog class that handles the cataloging and management of
//books in a library. Implement methods to add new books, search for books by
//title or author, keep track of available copies, and display book details.