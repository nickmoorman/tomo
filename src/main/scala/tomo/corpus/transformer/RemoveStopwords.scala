package tomo.corpus.transformer

import scala.io.Source

import tomo.corpus.Document

// http://www.ranks.nl/stopwords

object RemoveStopwords extends Transformer {
  def transform(document: Document): Document = {
    // Load stopwords
    val stopwords = Source.fromURL(getClass.getResource("/stopwords/en.txt")).getLines.toArray
    var newWords = document.words.filter(x => !stopwords.contains(x))
    document.words = newWords

    document
  }
}
