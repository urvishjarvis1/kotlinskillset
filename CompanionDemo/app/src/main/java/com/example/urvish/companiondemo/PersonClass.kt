package com.example.urvish.companiondemo
interface ReadEmail{
    fun readName(email: String)
}
class PersonClass(val NickName:String){
    companion object NickNameGetter:ReadEmail{

        fun getNickNameFromEmail(email:String):PersonClass{

            return PersonClass(email.substringBefore('@'))
        }

        override fun readName( email: String) {
            println(email)
        }
    }
}
