import domain.Gender.Gender
import domain.Person

/**
  * Created by Michael on 22/03/2017.
  */
class AddressBookChecker(addressBook: AddressBook) {

  def findByGender(gender: Gender): List[Person] = {
    addressBook.addresses.filter(_.gender == gender)
  }

}
