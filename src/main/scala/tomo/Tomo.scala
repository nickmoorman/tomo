package tomo

import tomo.corpus.Corpus
import tomo.corpus.loader.DirectoryLoader

object Tomo {
  def main(args: Array[String]) {
    // Create corpus by loading documents from source and transforming
    val loader = new DirectoryLoader(getClass.getResource("/corpora/files"))
    val corpus = new Corpus(loader)

    // Create model object

    // Run LDA algorithm

  }
}
