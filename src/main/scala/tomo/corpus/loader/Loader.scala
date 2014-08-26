package tomo.corpus.loader

import tomo.corpus.Document

trait Loader {
  def getDocuments(): List[Document]
}
