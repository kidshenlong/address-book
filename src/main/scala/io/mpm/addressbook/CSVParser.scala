package io.mpm.addressbook

import java.io.File

import com.github.tototoshi.csv.CSVReader
import io.mpm.addressbook.domain.Person

/**
  * Created by Michael on 22/03/2017.
  */
class CSVParser{

  def getEntries(location: String): List[Person] ={
    val reader = CSVReader.open(new File(location))

    reader.all().map{ line =>
      val trimmedLine = line.map(_.trim)
      Person( name = trimmedLine.head, gender = trimmedLine(1), dateOfBirth = trimmedLine(2))
    }

    //In a persistent application not calling this could cause issues. But in this instance it should be okay.
    //reader.close()
  }

}
