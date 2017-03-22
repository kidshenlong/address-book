package io.mpm.addressbook

import java.io.File

import com.github.tototoshi.csv.CSVReader
import io.mpm.addressbook.domain.Person
import io.mpm.addressbook.util.FileHandler

import scala.io.Source

/**
  * Created by Michael on 22/03/2017.
  */
class CSVParser(fileHandler: FileHandler = new FileHandler()){

  def getEntries(location: String): List[Person] = {
    fileHandler.getFile(location).map{ line =>
      val cols = line.split(",").map(_.trim)
      Person(cols(0), cols(1), cols(2))
    }.toList
  }

}
