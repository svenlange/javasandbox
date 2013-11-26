package co.za.svenlange.activeannotationsinaction

import za.co.svenlange.xtend.example.ProfileMethods

@ProfileMethods
class Pferd {
	
	def mahlzeit(String dummy) {
		println(dummy)
		"tach"
	}
	
}