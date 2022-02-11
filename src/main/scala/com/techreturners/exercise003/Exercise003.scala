package com.techreturners.exercise003

class Exercise003 {
//  val iceCreamFlavours = List("Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate","Mango Sorbet:")

  def getIceCreamCode(iceCreamFlavour: String): Int = {
    if (iceCreamFlavours.contains((iceCreamFlavour)))
      return iceCreamFlavours.indexOf(iceCreamFlavour)
    return -1
  }

  def iceCreamFlavours: Array[String] =  Array("Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate","Mango Sorbet")

}
