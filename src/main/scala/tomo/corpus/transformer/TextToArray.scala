package tomo.corpus.transformer

import tomo.corpus.Document

object TextToArray extends Transformer {
  def transform(document: Document): Document = {
    var text = if (document.cleaned != null) document.cleaned else document.body
    document.words = text.split(" ")

    document
  }
}
