package tomo.corpus.transformer

import tomo.corpus.Document

trait Transformer {
  def transform(document: Document): Document
}

object Transformer {
  def defaultTransformations(): List[Transformer] = {
    List(
      StripHtml,
      RemoveNewlines,
      ToLowercase,
      TextToArray,
      RemoveStopwords
    )
  }
}
