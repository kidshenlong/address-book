package io.mpm.addressbook.util

import scala.io.Source

class FileHandler {

  def getFile(filePath: String) = {
    val src = Source.fromFile(filePath)
    src.getLines()
  }

}
