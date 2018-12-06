name := "scala-examples"
version := "0.1"
scalaVersion := "2.12.7"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

libraryDependencies ++= {
  val akkaVersion       = "2.4.3"
  val scalaTestVersion  = "3.0.5"
  val scalaMockVersion  = "3.4.2"
  val redisVersion      = "1.7.0"
  Seq(
    "com.typesafe.akka" %% "akka-actor"                         % akkaVersion,
    "com.typesafe.akka" %% "akka-stream"                        % akkaVersion,
    "com.typesafe.akka" %% "akka-http-experimental"             % akkaVersion,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental"  % akkaVersion,
    "com.typesafe.akka" %% "akka-http-testkit"                  % akkaVersion,
    "com.github.etaty"  %% "rediscala"                          % redisVersion,
    "org.scalatest"     %% "scalatest"                          % scalaTestVersion  % "test",
    "org.scalamock"     %% "scalamock-scalatest-support"        % scalaMockVersion  % "test"
  )
}
