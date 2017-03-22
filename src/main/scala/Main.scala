import java.io.File

import com.github.tototoshi.csv.CSVReader
import domain.{Gender, Person}
import org.joda.time.Days

/**
  * Created by Michael on 22/03/2017.
  */
object Main extends App{

  val reader = CSVReader.open(new File("src/main/resources/AddressBook.csv"))

  val people = reader.all().map{ line =>
    val trimmedLine = line.map(_.trim)
    Person( name = trimmedLine.head, gender = trimmedLine(1), dateOfBirth = trimmedLine(2))
  }
  reader.close()

  println("How many males are in the address book?")
  println(people.collect{
    case p@Person(_, Gender.Male, _) => p
  }.length)

  println("Who is the oldest person in the address book?")

  def max(p1: Person, p2: Person): Person = if(p1.dateOfBirth.isBefore(p2.dateOfBirth)) p1 else p2

  val oldestPerson = people.reduceLeft(max)

  println(oldestPerson.name)

  println("How many days older is Bill than Paul?")

  val days = (for {
    bill <- people.find(_.name.startsWith("Bill"))
    paul <- people.find(_.name.startsWith("Paul"))
  } yield Days.daysBetween(bill.dateOfBirth, paul.dateOfBirth).getDays).getOrElse(0)
  println(days)

}
