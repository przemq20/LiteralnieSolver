//package tutorial.webapp
//import Parser.Parser
//import org.scalajs.dom
//import org.scalajs.dom.{Element, Event, document}
//
//import scala.scalajs.js.annotation.JSExportTopLevel
//
//object TutorialApp {
////  val wordlist = (new Parser).run()
//
//  def main(args: Array[String]): Unit = {
//    document.addEventListener("DOMContentLoaded", { (e: dom.Event) =>
//      setupUI()
//    })
//  }
//
//  def setupUI(): Unit = {
//    val button = document.createElement("button")
//    button.textContent = "Click me!"
//    button.addEventListener("click", { (e: dom.MouseEvent) =>
//      addClickedMessage()
//    })
//    document.body.appendChild(button)
//
//    appendPar(document.body, "Hello World")
//
//    val input = document.createElement("Input")
//    input.textContent = "dafas"
//    input.addEventListener("change", { (e: dom.Event) =>
//      onTextAdd(e)
//    })
//    document.body.appendChild(input)
//  }
//
//  def appendPar(targetNode: dom.Node, text: String): Element = {
//    val parNode = document.createElement("p")
//    parNode.textContent = text
//    targetNode.appendChild(parNode)
//    parNode
//  }
//
//  def removePar(targetNode: dom.Node, text: String): Unit = {
//    val parNode = document.createElement("p")
//    parNode.textContent = text
//    targetNode.appendChild(parNode)
//  }
//
//  @JSExportTopLevel("addClickedMessage")
//  def addClickedMessage(): Unit = {
//    appendPar(document.body, "You clicked the button!")
//  }
//
//  @JSExportTopLevel("onTextAdd")
//  def onTextAdd(text: Event): Unit = {
//    println(text)
//    appendPar(document.body, text.toString)
//  }
//}
