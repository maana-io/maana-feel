import sbt._

object Versions {
  // lazy val drunk          = "2.5.0"
  lazy val sangria        = "2.1.0"
  lazy val sangriaSlowLog = "2.0.1"
  lazy val sangriaCirce   = "1.3.1"
  lazy val config         = "1.4.1"
  lazy val akkaActor      = "2.6.12"
  lazy val akkaStream     = "2.6.12"
  lazy val akkaHttp       = "10.2.3"
  lazy val akkaHttpCirce  = "1.35.3"
  lazy val circe          = "0.13.0"
  lazy val jodaTime       = "2.9.9"
  lazy val scalatest      = "3.2.3"
  lazy val feel           = "1.12.4"
}

object Dependencies {
  // lazy val drunk          = "com.github.jarlakxen" %% "drunk"           % Versions.drunk
  lazy val sangria        = "org.sangria-graphql"  %% "sangria"           % Versions.sangria
  lazy val sangriaSlowlog = "org.sangria-graphql"  %% "sangria-slowlog"   % Versions.sangriaSlowLog
  lazy val sangriaCirce   = "org.sangria-graphql"  %% "sangria-circe"     % Versions.sangriaCirce
  lazy val config         = "com.typesafe"         %  "config"            % Versions.config
  // lazy val akkaActor      = "com.typesafe.akka"    %% "akka-actor"        % Versions.akkaActor
  lazy val akkaActorTyped = "com.typesafe.akka"    %% "akka-actor-typed"  % Versions.akkaActor
  lazy val akkaStream     = "com.typesafe.akka"    %% "akka-stream"       % Versions.akkaStream
  lazy val akkaHttp       = "com.typesafe.akka"    %% "akka-http"         % Versions.akkaHttp
  lazy val akkaHttpCirce  = "de.heikoseeberger"    %% "akka-http-circe"   % Versions.akkaHttpCirce
  lazy val circeCore      = "io.circe"             %% "circe-core"        % Versions.circe
  lazy val circeParser    = "io.circe"             %% "circe-parser"      % Versions.circe
  lazy val circeOptics    = "io.circe"             %% "circe-optics"      % Versions.circe
  lazy val circeGeneric   = "io.circe"             %% "circe-generic"     % Versions.circe
  lazy val jodaTime       = "joda-time"            %  "joda-time"         % Versions.jodaTime
  lazy val scalatest      = "org.scalatest"        %% "scalatest"         % Versions.scalatest % Test
  lazy val feel           = "org.camunda.feel"     %  "feel-engine"       % Versions.feel
}
