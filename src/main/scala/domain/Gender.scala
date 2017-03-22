package domain

/**
  * Created by Michael on 22/03/2017.
  */
object Gender extends Enumeration{

  type Gender = Value

  //val Male, Female, Other = Value
  val Male = Value("male")
  val Female = Value("female")
  val Other = Value("other")

  def apply(name: String): Gender.Value = {
    Gender.super.withName(name.toLowerCase)
  }
}
