name := "finch-sample"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.7"

lazy val circeVersion = "0.10.0"
lazy val finchVersion = "0.25.0"

libraryDependencies ++= Seq(
  "com.github.finagle" %% "finch-core" % finchVersion,
  "com.github.finagle" %% "finch-circe" % finchVersion,
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
)