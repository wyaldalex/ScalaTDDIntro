ThisBuild / version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.6" % "test"
libraryDependencies +="info.cukes" %% "cucumber-scala" % "1.2.4" % "test"
libraryDependencies +="info.cukes" % "cucumber-junit" % "1.2.4" % "test"
libraryDependencies +="junit" % "junit" % "4.11" % "test"

lazy val root = (project in file("."))
  .settings(
    name := "TDD1"
  )
