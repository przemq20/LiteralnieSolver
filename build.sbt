ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"
enablePlugins(ScalaJSPlugin)

mainClass := Some("tutorial.webapp.TutorialApp")

lazy val root = (project in file("."))
  .settings(
    name := "LiteralnieSolver"
  )
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.1.0"
scalaJSUseMainModuleInitializer := true