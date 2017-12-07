package utils

import scala.io.Source

object FileReader {

  def getInput(filename: String):List[String] = {
    val path = s"src/main/resources/$filename"
    Source.fromFile(s"$path").getLines.toList
  }



}
