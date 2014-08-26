package tomo.corpus.loader;

import scala.io.Source

import java.io.File
import java.net.URL

import tomo.corpus._

class DirectoryLoader(directory: File) extends Loader {
  // TODO: Handle non-existent or empty directory
  // TODO: Filter should be optional
  // val files = for (file <- directory.listFiles) {

  //     if (file.getName.endsWith(".txt")) {
  //         new Document(file.getName.replace("\\.txt", ""),
  //                      Source.fromFile(file).getLines.mkString)
  //     }
  // }
  //val files :Iterator[File] = directory.listFiles.filter(_.getName.endsWith(".txt")).iterator
  val files: List[File] = directory.listFiles.filter(_.getName.endsWith(".txt")).toList

  def this(dirName: String) {
    this(new File(dirName))
  }

  def this(dirUrl: URL) {
    this(dirUrl.getPath)
  }

  def getDocuments(): List[Document] = {
    val docs = for (i <- 0 until files.size) yield {
      val file = files(i)
      val id = file.getName.replace("\\.txt", "")
      val rawContent = Source.fromFile(file).getLines.mkString

      new Document(id, rawContent)
    }

    docs.toList
  }

  // override def hasNext() = files.hasNext

  // override def next() = {
  //     val file = files.next
  //     val id = file.getName.replace("\\.txt", "")
  //     val rawContent = Source.fromFile(file).getLines.mkString

  //     new Document(id, rawContent)
  // }
}
