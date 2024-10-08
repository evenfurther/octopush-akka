import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import scalariform.formatter.preferences._

lazy val octopushAkka = project
    .in(file("."))
    .settings(
      name := "octopush-akka",
      organization := "net.rfc1149",
      version := "0.0.2",
      crossScalaVersions := List("2.13.12", "3.3.1"),
      scalaVersion := "3.5.0",
      scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-actor" % "2.8.6",
        "com.typesafe.akka" %% "akka-stream" % "2.8.6",
        "com.typesafe.akka" %% "akka-stream-testkit" % "2.8.6" % "test",
        "com.typesafe.akka" %% "akka-http-core" % "10.5.3",
        "com.typesafe.akka" %% "akka-http-xml" % "10.5.3",
        "com.iheart" %% "ficus" % "1.5.2",
        "org.specs2" %% "specs2-core" % "4.20.8" % "test"
      ),
      Test/fork := true,
      scalariformAutoformat := true,
      ScalariformKeys.preferences := ScalariformKeys.preferences.value
        .setPreference(AlignArguments, true)
        .setPreference(AlignSingleLineCaseStatements, true)
        .setPreference(DoubleIndentConstructorArguments, true)
        .setPreference(SpacesWithinPatternBinders, false)
        .setPreference(SpacesAroundMultiImports, false))
