name := "scala-examples"
version := "0.1"
scalaVersion := "2.12.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-Ypartial-unification")

libraryDependencies ++= {
  val scalaTestVersion  = "3.0.5"
  val scalaMockVersion  = "3.4.2"
  val catsVersion       = "1.5.0"
  Seq(
    "org.scalatest"     %% "scalatest"                    % scalaTestVersion  % "test",
    "org.scalamock"     %% "scalamock-scalatest-support"  % scalaMockVersion  % "test",
    "org.typelevel"     %% "cats-core"                    % catsVersion
  )
}
