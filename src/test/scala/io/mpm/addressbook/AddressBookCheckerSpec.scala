package io.mpm.addressbook

import io.mpm.addressbook.domain.{Gender, Person}
import org.specs2.mutable.Specification

class AddressBookCheckerSpec extends Specification{

  "AddressBookChecker" should {

    val addresses = List(
      Person("Jason Bateman", "male", "14/01/1969"),
      Person("Portia de Rossi", "female", "31/01/1973"),
      Person("Will Arnett", "male", "04/05/1970"),
      Person("Michael Cera", "male", "07/06/1988")
    )

    "findByGender should find one female" in {

      val addressBook = new AddressBook(addresses)

      val addressBookChecker = new AddressBookChecker(addressBook)

      addressBookChecker.findByGender(Gender.Female).length === 1
    }

    "findOldest should find Jason Bateman" in {

      val addressBook = new AddressBook(addresses)

      val addressBookChecker = new AddressBookChecker(addressBook)

      addressBookChecker.findOldest === Person("Jason Bateman", "male", "14/01/1969")
    }

    "getAgeDifferenceInDays should calculate the age difference" in {

      val addressBook = new AddressBook(addresses)

      val addressBookChecker = new AddressBookChecker(addressBook)

      addressBookChecker.getAgeDifferenceInDays("Jason", "Michael") === 7084
    }
  }
}
