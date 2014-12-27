package co.za.svenlange.activeannotationsinaction

import za.co.svenlange.xtend.example.ProfileMethods

@ProfileMethods
class Pferd {

    def static void main(String... args) {
        println("Toll")
        new Pferd().wasAnderes(500)
    }
    
    def CharSequence wasAnderes(int times) {
        for (var i = 0 ; i < times; i++) {
            print('clippity-clop! ')
        }
        "moin"
    }

}
