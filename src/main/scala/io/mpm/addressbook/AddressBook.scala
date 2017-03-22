package io.mpm.addressbook

import io.mpm.addressbook.domain.Person

/**
  * Created by Michael on 22/03/2017.
  */
class AddressBook(val addresses: List[Person] = List.empty[Person] ) {

  def findByName(name: String): Option[Person] = addresses.find(_.name.toLowerCase.startsWith(name.toLowerCase))

}
