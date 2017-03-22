import java.io.File

import com.github.tototoshi.csv.CSVReader
import domain.{Gender, Person}
import org.joda.time.Days

/**
  * Created by Michael on 22/03/2017.
  */
object Main extends App{

  val addresses = new CSVParser().getEntries("src/main/resources/AddressBook.csv")

  val addressBook = new AddressBook(addresses)

  val addressBookChecker = new AddressBookChecker(addressBook)

  println("How many males are in the address book?")

  println(addressBookChecker.findByGender(gender = Gender.Male).length)

}
