package co.za.svenlange.activeannotationsinaction;

import za.co.svenlange.xtend.example.ProfileMethods;

@ProfileMethods
@SuppressWarnings("all")
public class Pferd {
  public Object mahlzeit(final String dummy) {
    System.out.println("Moin!");
  }
}
