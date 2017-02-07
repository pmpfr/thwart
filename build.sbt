name := "thwart"

version := "1.0"

scalaVersion := "2.12.1"

libraryDependencies ++=  Seq(
  "codes.reactive" %% "scala-time" % "0.4.1"
)

scalacOptions += "-unchecked"
