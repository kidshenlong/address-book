import java.io.File

import com.github.tototoshi.csv.CSVReader

import scala.io.Source

/**
  * Created by Michael on 22/03/2017.
  */
object Main extends App{

  val bufferedSource = Source.fromFile("src/main/resources/AddressBook.csv")

  bufferedSource.getLines().foreach(println)

  bufferedSource.close()

  val reader = CSVReader.open(new File("src/main/resources/AddressBook.csv"))

  reader.all().foreach{ line =>

    println(s"Name: ${line(0)} | ${line(1)} | ${line(2)}")

  }

  reader.close()
}
