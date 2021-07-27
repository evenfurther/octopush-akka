import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import scalariform.formatter.preferences._

lazy val octopushAkka = project
    .in(file("."))
    .settings(
      name := "octopush-akka",
      organization := "net.rfc1149",
      version := "0.0.2",
      scalaVersion := "2.13.6",
      scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature"),
      libraryDependencies ++= Seq(
        "com.typesafe.akka" %% "akka-actor" % "2.6.15",
        "com.typesafe.akka" %% "akka-stream" % "2.6.15",
        "com.typesafe.akka" %% "akka-stream-testkit" % "2.6.15" % "test",
        "com.typesafe.akka" %% "akka-http-core" % "10.2.5",
        "com.typesafe.akka" %% "akka-http-xml" % "10.2.5",
        "com.iheart" %% "ficus" % "1.5.0",
        "org.specs2" %% "specs2-core" % "4.12.3" % "test"
      ),
      fork in Test := true,
      scalariformAutoformat := true,
      ScalariformKeys.preferences := ScalariformKeys.preferences.value
        .setPreference(AlignArguments, true)
        .setPreference(AlignSingleLineCaseStatements, true)
        .setPreference(DoubleIndentConstructorArguments, true)
        .setPreference(SpacesWithinPatternBinders, false)
        .setPreference(SpacesAroundMultiImports, false))
