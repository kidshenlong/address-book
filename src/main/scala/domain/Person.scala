package domain

import domain.Gender.Gender
import com.github.nscala_time.time.Imports._
import org.joda.time.format.DateTimeFormat


/**
  * Created by Michael on 22/03/2017.
  */
case class Person(name: String, gender: Gender, dateOfBirth: DateTime)

object Person{

  def apply(name: String, gender: String, dateOfBirth: String): Person = {

    val formatter = DateTimeFormat.forPattern("dd/MM/yy")

    new Person(name, Gender(gender), formatter.parseDateTime(dateOfBirth))
  }
}

