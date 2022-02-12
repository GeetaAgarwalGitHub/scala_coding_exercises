package com.techreturners.exercise004
import java.time.temporal.ChronoUnit
import java.time.{LocalDate, LocalDateTime, Month}
import java.time.{LocalDate, LocalDateTime}

class Exercise004(var dateTime: LocalDateTime) {

  // Hint take a look at Scala auxiliary constructors
  // https://docs.scala-lang.org/overviews/scala-book/classes-aux-constructors.html
  // Try constructing a "LocalDateTime" from a "LocalDate"
  // You might need to default the time to be something like midnight


  def getDateTimeWithGigaSecond: LocalDateTime =
    LocalDateTime.of(dateTime.getYear, dateTime.getMonth, dateTime.getDayOfMonth, dateTime.getHour, dateTime.getMinute, dateTime.getSecond, dateTime.getNano).plus(1000000000,ChronoUnit.SECONDS);



}