name := "basic-project"

organization := "example"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.2"

crossScalaVersions := Seq("2.10.4", "2.11.2")

libraryDependencies ++= Seq(
    "org.apache.spark" %% "spark-core" % "1.2.0",
    "org.apache.spark" %% "spark-streaming" % "1.2.0",
    "org.apache.spark" %% "spark-streaming-twitter" % "1.2.0"
)

initialCommands := "import main._"
