package domain

import domain.Gender.Gender

/**
  * Created by Michael on 22/03/2017.
  */
class AddressBook(people: List[Person]) {

  def findByName(name: String): Person = ???
  def findByGender(gender: Gender): Person = ???

}
