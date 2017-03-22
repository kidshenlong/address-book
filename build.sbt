name := "address-book"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "com.github.tototoshi"    %%  "scala-csv"   % "1.3.4",
  "com.github.nscala-time"  %%  "nscala-time" % "2.16.0",
  "org.specs2"              %%  "specs2-core" % "3.8.9"   % "test"
)
    