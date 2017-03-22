package io.mpm.addressbook.domain

object Gender extends Enumeration{

  type Gender = Value

  val Male = Value("male")
  val Female = Value("female")
  val Other = Value("other")

  def apply(name: String): Gender.Value = {
    Gender.super.withName(name.toLowerCase)
  }
}
