ThisBuild / version := "0.0.1"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "savings-bot",
    idePackagePrefix := Some("com.kushnerdmitry")
  )
