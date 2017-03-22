package io.mpm.addressbook

import io.mpm.addressbook.domain.Gender.Gender
import io.mpm.addressbook.domain.Person
import org.joda.time.Days

/**
  * Created by Michael on 22/03/2017.
  */
class AddressBookChecker(addressBook: AddressBook) {

  def findByGender(gender: Gender): List[Person] = addressBook.addresses.filter(_.gender == gender)

  def findOldest: Person = {
    def max(p1: Person, p2: Person): Person = if(p1.dateOfBirth.isBefore(p2.dateOfBirth)) p1 else p2

    addressBook.addresses.reduceLeft(max)
  }

  def getAgeDifferenceInDays(person1: String, person2: String) = {
    (for {
      left <- addressBook.findByName(person1)
      right <- addressBook.findByName(person2)
    } yield Days.daysBetween(left.dateOfBirth, right.dateOfBirth).getDays).getOrElse(0)
  }

}
