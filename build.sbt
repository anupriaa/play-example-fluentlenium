name := "play-example-fluentlenium"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean
)     

play.Project.playJavaSettings