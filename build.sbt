name := "thwart"

organization := "thwart"

scalaVersion := "2.12.4"

crossScalaVersions := Seq("2.11.11", "2.10.6", "2.12.4")

libraryDependencies ++=  Seq(
  "org.wartremover" %% "wartremover" % "2.2.1"
)

scalacOptions += "-unchecked"
