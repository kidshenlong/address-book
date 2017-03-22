import scala.io.Source

/**
  * Created by Michael on 22/03/2017.
  */
object Main extends App{

  val bufferedSource = Source.fromFile("src/main/resources/AddressBook.csv")

  bufferedSource.getLines().foreach(println)

  bufferedSource.close()

}
