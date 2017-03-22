package io.mpm.addressbook

import com.github.tototoshi.csv.CSVReader
import io.mpm.addressbook.domain.Person
import io.mpm.addressbook.util.FileHandler
import org.specs2.mock.Mockito
import org.specs2.mutable.Specification

/**
  * Created by Michael on 22/03/2017.
  */
class CSVParserSpec extends Specification with Mockito{

  "CSVParser" should {
    "parse csv to case classes" in {

      val fileHandler = mock[FileHandler]

      val iterator = Seq("Bill McKnight, Male, 16/03/77", "Paul Robinson, Male, 15/01/85", "Gemma Lane, Female, 20/11/91").toIterator
      fileHandler.getFile(any) returns iterator

      val cSVParser = new CSVParser(fileHandler)

      val people = List(
        Person("Bill McKnight", "male", "16/03/77"),
        Person("Paul Robinson", "male", "15/01/85"),
        Person("Gemma Lane", "female", "20/11/91")
      )
      cSVParser.getEntries("some/location") === people

    }
  }


}
