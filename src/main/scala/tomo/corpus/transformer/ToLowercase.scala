package tomo.corpus.transformer

import tomo.corpus.Document

object ToLowercase extends Transformer {
  def transform(document: Document): Document = {
    var text = if (document.cleaned != null) document.cleaned else document.body
    document.cleaned = text.toLowerCase

    document
  }
}
