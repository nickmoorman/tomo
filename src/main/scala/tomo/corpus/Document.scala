package tomo.corpus

class Document(var id: String, var body: String) {
  var cleaned: String = null
  var words: Array[String] = null
}
