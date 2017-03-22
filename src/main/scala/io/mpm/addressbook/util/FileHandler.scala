package io.mpm.addressbook.util

import scala.io.Source

/**
  * Created by Michael on 22/03/2017.
  */
class FileHandler {

  def getFile(filePath: String) = {
    val src = Source.fromFile(filePath)
    src.getLines()
  }

}
