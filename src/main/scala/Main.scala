import java.io.File

import com.github.tototoshi.csv.CSVReader

/**
  * Created by Michael on 22/03/2017.
  */
object Main extends App{

  case class Person(name: String, gender: String, dateOfBirth: String)

  val reader = CSVReader.open(new File("src/main/resources/AddressBook.csv"))

  val people = reader.all().map{ line =>
    val trimmedLine = line.map(_.trim)
    Person( name = trimmedLine.head, gender = trimmedLine(1), dateOfBirth = trimmedLine(2))
  }
  reader.close()

  println("How many males are in the address book?")
  println(people.collect{
    case p@Person(_, "Male", _) => p
  }.length)

}
