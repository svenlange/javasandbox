package co.za.svenlange.activeannotationsinaction

import za.co.svenlange.xtend.example.ProfileMethods

@ProfileMethods
class Pferd {
	
	def void mahlzeit1(String dummy) {
		println(dummy)  
		"tach"
	}
	
	def void mahlzeit2(String dummy) {
		println(dummy)
		"tach"
	}
	
}