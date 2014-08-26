package tomo.corpus

import tomo.corpus.loader.Loader
import tomo.corpus.transformer.Transformer

class Corpus(loader: Loader, transformations: List[Transformer]) {
  val documents = loader.getDocuments()
  documents.foreach {
    (document) =>
      transformations.foreach {
        (transformer) => transformer.transform(document)
      }
  }

  def this(loader: Loader) = {
    this(loader, Transformer.defaultTransformations())
  }
}
