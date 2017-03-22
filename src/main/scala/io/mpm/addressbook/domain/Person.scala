package io.mpm.addressbook.domain

import com.github.nscala_time.time.Imports._
import io.mpm.addressbook.domain.Gender.Gender
import org.joda.time.format.DateTimeFormat

case class Person(name: String, gender: Gender, dateOfBirth: DateTime)

object Person{

  def apply(name: String, gender: String, dateOfBirth: String): Person = {

    val formatter = DateTimeFormat.forPattern("dd/MM/yy")

    new Person(name, Gender(gender), formatter.parseDateTime(dateOfBirth))
  }
}

