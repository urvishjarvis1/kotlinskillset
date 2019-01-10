package com.example.urvish.delegationdemo
interface Showable{
    fun show()
}
class View : Showable{
    override fun show() {
        println("View.show()")
    }
}

class CustomView:Showable{
    override fun show() {
        println("CustomView.show()")
    }

}

class Screen(view:View):Showable by view
class Screen1(customView: CustomView):Showable by customView
