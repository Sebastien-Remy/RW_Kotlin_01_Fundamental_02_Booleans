fun main() {
    val isProgrammingAwesome = true
    println("Is programming awesome? $isProgrammingAwesome")

    var myAge = 50
    var isDrivingAge = myAge >= 18
    println ("My age is $myAge, driving license age: $isDrivingAge")

    val yearOffBirth = 1971
    val iBornOnTwentyFirstCentury = yearOffBirth > 2000
    println ("Born in XXI century? $iBornOnTwentyFirstCentury")

    val myName = "REMY"
    val otherName = "REMY"
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
    var pasword = "1234"
    var passwordIsSecure = pasword.length >= 10
    println ("Password is secure (1)? $passwordIsSecure")

    // Challenge 2
    // Password same name length
    passwordIsSecure = pasword.length == myName.length
    println ("Password is secure (2)? $passwordIsSecure")

    // Operators
    myAge = 20
    var country = "USA"
    isDrivingAge = (myAge >= 18 && country == "France") || (country == "USA" && myAge >= 16)
    println ("At $myAge years old is legal to drive in $country? $isDrivingAge")

    // If Else
    if (isDrivingAge) {
        println("You can drive!")
    } else {
        println("You've got a bit more time to go!")
    }

    if(myAge >=18) println("I'm an adult") else println("I'm still underaged!")

    println (if (myAge >=18) "I'm an adult" else "I'm still underaged!")

    // Complex If Else
    if (myAge >= 16) {
        if (country == "USA" && myAge <= 21) {
            println ("You can drive but not drink")
        } else if (country == "France" && myAge >= 21) {
            println ("You can drive and drink (not on the same time!")
        }
    }

    // Challenge 2
    var userName = "SEBZEEZZEEZEZ"
    var email = "tota@me.com"
    pasword = "11"
    var passwordMessage = if (userName.isEmpty() || email.isEmpty() || pasword.isEmpty()) {
        "You may fill all your datad"
        } else if (userName.length <= 6) {
        "User name may content at least 6 characters"
    } else if (pasword.length <= 10){
        "Password name may content at least 10 characters"
        } else if (!email.contains("@") || !email.contains(".") ) {
            "User name must contains @ and dot"
    }else {
            "Succes"
    }

    println (passwordMessage)

    // Null Value
    var nickName: String? = null
    // nickName = "seb"
    println(nickName)

    val nickNameLength = nickName?.length?.toDouble()
    println ("nick name $nickName, length: $nickNameLength")

    // Default nickname for null value
    val myNickName = nickName ?: myName
    println ("nick name $myNickName, length: ${myNickName.length}")
}

