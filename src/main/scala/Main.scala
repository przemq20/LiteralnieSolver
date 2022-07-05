object Main extends App {
  val lettersInPositions:  Map[Int, Char] = Map(1 -> 'u', 2 -> 'r', 4 -> 'a')
  val lettersNotInTheWord: List[Char]     = List('k', 'w', 'b', 'z', 't', 'l')
//    List('p','l','e','j','k','u','w','m','c','h','i','n','d','g')
  val lettersSomewhereInTheWord: List[Char] =
    List.empty
//    List('r', 'o')

  val wordList = (new Parser.Parser)
    .getFilteredWords(lettersInPositions, lettersNotInTheWord, lettersSomewhereInTheWord)

  println(wordList.length)
  println(wordList)
}
