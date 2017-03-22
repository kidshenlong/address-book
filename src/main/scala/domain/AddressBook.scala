package domain

import java.io.File

import com.github.tototoshi.csv.CSVReader
import domain.Gender.Gender

/**
  * Created by Michael on 22/03/2017.
  */
class AddressBook() {

  val addresses: List[Person] = loadAddresses()

  def findByName(name: String): Option[Person] = addresses.find(_.name.toLowerCase.startsWith(name.toLowerCase))

  private def loadAddresses() = {

    val reader = CSVReader.open(new File("src/main/resources/AddressBook.csv"))

    reader.all().map{ line =>
      val trimmedLine = line.map(_.trim)
      Person( name = trimmedLine.head, gender = trimmedLine(1), dateOfBirth = trimmedLine(2))
    }
    //reader.close()


  }

}
