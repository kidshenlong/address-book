package io.mpm.addressbook

import io.mpm.addressbook.domain.{Gender, Person}
import org.specs2.mutable.Specification
import org.specs2.specification.Scope

/**
  * Created by Michael on 22/03/2017.
  */
class AddressBookSpec extends Specification{

  "AddressBook" should {

    "test 1" in {
      new AddressBook().addresses.length === 0
    }

    "test 2" in {

      val addresses = List(
        Person("Robert Downey Jr.", "male", "04/04/1965"),
        Person("Chris Evans", "male", "13/06/1981"),
        Person("Scarlett Johansson", "female", "22/11/1984")
      )
      new AddressBook(addresses).addresses.length === 3
    }

    "find" in {

      new AddressBook().findByName("Michael") === None
    }
  }
}
