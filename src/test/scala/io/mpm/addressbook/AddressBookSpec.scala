package io.mpm.addressbook

import io.mpm.addressbook.domain.Person
import org.specs2.mutable.Specification

class AddressBookSpec extends Specification{

  "AddressBook" should {

    val addresses = List(
      Person("Robert Downey Jr.", "male", "04/04/1965"),
      Person("Chris Evans", "male", "13/06/1981"),
      Person("Scarlett Johansson", "female", "22/11/1984")
    )

    "an empty address book should have addresses" in {
      new AddressBook().addresses.length === 0
    }

    "an address book wih addresses should return them" in {
      new AddressBook(addresses).addresses.length === 3
    }

    "find should return a none when it cannot find by name" in {
      new AddressBook().findByName("Michael") === None
    }

    "find should return a person when it can find by name" in {
      new AddressBook(addresses).findByName("Scarlett") === Some(Person("Scarlett Johansson", "female", "22/11/1984"))
    }
  }
}
