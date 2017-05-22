val commonSettings = Seq(
  organization := "demo",
  name := "tls-demo",
  version := "1.0.0",

  scalacOptions ++= Seq(
    "-feature",
    "-language:higherKinds"
  ),
  resolvers += Resolver.sonatypeRepo("snapshots"),
  libraryDependencies ++= Seq(
    "com.chuusai" %% "shapeless" % "2.3.2"
  )
)

val lbsSettings = Seq(
  scalaOrganization := "org.scala-lang",
  scalaVersion := "2.12.2"
)

val tlsSettings = Seq(
  scalaOrganization := "org.typelevel",
  scalaVersion := "2.12.2-bin-typelevel-4",
  scalacOptions ++= Seq(
    "-Ypartial-unification",
    "-Yliteral-types",
    "-Ykind-polymorphism",
    "-Yinduction-heuristics"
  )
)

val si2712 = (project in file("si2712")).
  settings(commonSettings: _*).
  //settings(lbsSettings: _*)
  settings(tlsSettings: _*)

val si7046 = (project in file("si7046")).
  settings(commonSettings: _*).
  settings(lbsSettings: _*)
  //settings(tlsSettings: _*)

val literaltypes = (project in file("literaltypes")).
  settings(commonSettings: _*).
  settings(initialCommands in console := """import shapeless._, record._, syntax.singleton._; import literaltypes.Demo._""").
  settings(tlsSettings: _*)

val inductive = (project in file("inductive")).
  settings(commonSettings: _*).
  settings(initialCommands in console := """import shapeless._, ops.hlist._; import inductive.Demo._""").
  //settings(lbsSettings: _*)
  settings(tlsSettings: _*)

val kindpoly = (project in file("kindpoly")).
  settings(commonSettings: _*).
  settings(tlsSettings: _*)

val patterntargs = (project in file("patterntargs")).
  settings(commonSettings: _*).
  settings(initialCommands in console := """import shapeless._ ; import patterntargs.Demo._""").
  settings(tlsSettings: _*)
