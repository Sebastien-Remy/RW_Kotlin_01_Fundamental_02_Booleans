fun main() {
    val isProgrammingAwesome = true
    println("Is programming awesome? $isProgrammingAwesome")

    val myAge = 50
    val isMageDrivingAge = myAge >= 18
    println ("My age is $myAge, driving license age: $isMageDrivingAge")

    val yearOffBirth = 1971
    val iBornOnTwentyFirstCentury = yearOffBirth > 2000
    println ("Born in XXI century? $iBornOnTwentyFirstCentury")

    val myName = "REMY"
    val otherName = "REMY"
//    val otherName = "CHAPO"
    val isSameName = myName == otherName
    println ("$myName and $otherName are same name? $isSameName")

    val firstObject = Any()
    val secondObject = Any()
    println(firstObject === secondObject)
    println(firstObject !== secondObject)

    val isNameEmpty = myName.isEmpty()
    println("My name var is empty? $isNameEmpty")

    // Challenge 1
    // Password  must have 10 characters
    val pasword = "1234"
    var passwordIsSecure = pasword.length >= 10
    println ("Password is secure (1)? $passwordIsSecure")

    // Challende 2
    // Password same name length
    passwordIsSecure = pasword.length == myName.length
    println ("Password is secure (2)? $passwordIsSecure")
}

