package tomo.corpus.transformer

import tomo.corpus.Document

object RemoveNewlines extends Transformer {
  def transform(document: Document): Document = {
    var text = if (document.cleaned != null) document.cleaned else document.body
    document.cleaned = text.replaceAll("\\r\\n", "").replaceAll("\\n", "")

    document
  }
}
