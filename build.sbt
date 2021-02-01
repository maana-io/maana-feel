version := sys.env.getOrElse("BUILD_VERSION", "v0.0.1")

name := sys.env.getOrElse("NAME", "maana-feel")

packageName in Docker := sys.env.getOrElse("PACKAGE_NAME", "maana-feel")

description := "Maana FEEL "

scalaVersion := "2.12.13"
scalacOptions ++= Seq("-deprecation", "-feature")

resolvers += Resolver.bintrayRepo("jarlakxen", "maven")

libraryDependencies ++= Seq(
  Dependencies.drunk,
  Dependencies.sangria,
  Dependencies.sangriaSlowlog,
  Dependencies.sangriaCirce,
  Dependencies.akkaHttp,
  Dependencies.akkaHttpCirce,
  Dependencies.circeCore,
  Dependencies.circeParser,
  Dependencies.circeOptics,
  Dependencies.circeGeneric,
  Dependencies.jodaTime,
  Dependencies.scalatest
)

Revolver.settings
enablePlugins(JavaAppPackaging)

scalafmtOnCompile in ThisBuild := true
