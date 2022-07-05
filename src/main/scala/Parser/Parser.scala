package Parser

import scala.io.Source

class Parser {

  def getFilteredWords(
    lettersInPositions:        Map[Int, Char],
    lettersNotInTheWord:       List[Char],
    lettersSomewhereInTheWord: List[Char]
  ): List[Word] = {
    val wordList = getWordList

    val filteredWords = wordList
      .map(word => Parser.Word(word.string.toLowerCase))
      .filter(word => word.string.length == 5)
      .filter { word =>
        lettersInPositions.forall {
          case (position: Int, letter: Char) =>
            word.string(position) == letter
        } &&
        lettersSomewhereInTheWord.forall(letter => word.string.contains(letter)) &&
        lettersNotInTheWord.forall(letter       => !word.string.contains(letter))
      }
    filteredWords
  }

  def getWordList: List[Word] = {
    val stringList = readFile()
    stringList.map(Word)
  }

  def readFile(): List[String] = {
    val filename = "src/main/resources/slowa.txt"
    Source.fromFile(filename).getLines.toList
  }

}
