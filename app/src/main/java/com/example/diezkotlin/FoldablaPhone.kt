package com.example.diezkotlin

class FoldablaPhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {

    var isFoldable: Boolean = false

    override fun switchOn(){
        if(!isFoldable){
            isScreenLightOn=true;
        }
    }

    fun abrir(){
        isFoldable = true
    }
    fun cerrar(){
        isFoldable = false
    }

}
//nombre solo es un parametro de la clase porque no tiene val ni var, al no tener eso cuando pongo p. no aparece el nombre
//class Perosna (nombre:String, val apellido: String)

//fun  main(){
   // val p= Perosna("Laurence","Juice")
    //p.apellido

//}