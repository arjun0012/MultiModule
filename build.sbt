ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "MultiModule"
  )
  .aggregate(module1,module2,common)

lazy val module1=project

lazy val module2=project
  .settings(
    libraryDependencies +="org.scalatest" %% "scalatest" % "3.2.15" % Test
  )

lazy val common =project.dependsOn(module1,module2)
