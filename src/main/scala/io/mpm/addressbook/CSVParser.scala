package io.mpm.addressbook

import io.mpm.addressbook.domain.Person
import io.mpm.addressbook.util.FileHandler

class CSVParser(fileHandler: FileHandler = new FileHandler()){

  def getEntries(location: String): List[Person] = {
    fileHandler.getFile(location).map{ line =>
      val cols = line.split(",").map(_.trim)
      Person(cols(0), cols(1), cols(2))
    }.toList
  }

}
