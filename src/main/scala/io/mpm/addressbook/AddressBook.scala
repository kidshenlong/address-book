package io.mpm.addressbook

import io.mpm.addressbook.domain.Person

class AddressBook(val addresses: List[Person] = List.empty[Person] ) {

  def findByName(name: String): Option[Person] = addresses.find(_.name.toLowerCase.startsWith(name.toLowerCase))

}
