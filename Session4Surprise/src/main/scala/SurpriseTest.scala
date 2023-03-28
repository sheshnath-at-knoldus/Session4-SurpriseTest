package com.knoldus


case class Num(number:String ,isEven :Boolean)

object SurpriseTest extends App{


  val listOfNum = List(Num("1", false), Num("2", true), Num("3", false), Num("4", true))

  val filterEvenNumber = listOfNum.filter(value => value.number.toInt % 2 == 0)
  val filterOddNumber = listOfNum.filter(value => !value.isEven)

  val partitionList = listOfNum.partition(value => value.isEven)
  val firstElement = listOfNum.map(value=>value.number)


  println("Filtered EvenNumber: "+filterEvenNumber)
  println("Filtered OddNumber : "+filterOddNumber)
  println("Partition : "+partitionList)
  println("First element of List :"+firstElement)



}

















