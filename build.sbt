import com.lihaoyi.workbench.Plugin._

workbenchSettings

lazy val commonSettings = Seq(
  scalaVersion := "2.11.7",
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-encoding", "UTF-8",
    "-language:implicitConversions",
    "-language:higherKinds",
    "-language:reflectiveCalls"
  )
)

lazy val raphaeljs = project.settings(commonSettings: _*).settings(
  sonatypeSettings,
  organization               := "com.github.yoeluk",
  version                    := "0.2-SNAPSHOT",
  name                       := "raphael-scala-js",
  libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.1",
  jsDependencies += "org.webjars.bower" % "raphael" % "2.1.4" / "raphael-min.js" commonJSName "raphael",
  persistLauncher in Compile := true,
  persistLauncher in Test    := false,
  publishMavenStyle          := true,
  publishArtifact in Test    := false,
  pomIncludeRepository       := { _ => false },
  publishTo <<= version { v: String =>
    val nexus = "https://oss.sonatype.org/"
    if (v.trim.endsWith("SNAPSHOT"))
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases"  at nexus + "service/local/staging/deploy/maven2")
  },
  pomExtra := {
    <url>https://github.com/yoeluk/raphael-scala-js</url>
    <licenses>
      <license>
        <name>Apache 2</name>
        <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      </license>
    </licenses>
    <scm>
      <connection>https://github.com/yoeluk/raphael-scala-js.git</connection>
      <developerConnection>scm:git:git@github.com:yoeluk/raphael-scala-js.git</developerConnection>
      <url>github.com/yoeluk/raphael-scala-js</url>
    </scm>
    <developers>
      <developer>
        <id>yoeluk</id>
        <name>Yoel RGD</name>
        <url>https://github.com/yoeluk/</url>
      </developer>
    </developers>
  }
).enablePlugins(ScalaJSPlugin)

lazy val root = (project in file(".")).settings(commonSettings: _*).settings(
  version := "0.2-SNAPSHOT",
  name := "Sketcher",
  persistLauncher in Compile := false,
  persistLauncher in Test := false,
  skip in packageJSDependencies := false,
  testFrameworks += new TestFramework("utest.runner.Framework"),
  libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "scalarx" % "0.2.8"
  )
).enablePlugins(ScalaJSPlugin).dependsOn(raphaeljs)

bootSnippet := "sketcher.Sketcher().main(document.getElementById('scene'));"

updateBrowsers <<= updateBrowsers.triggeredBy(fastOptJS in Compile)

refreshBrowsers <<= refreshBrowsers.triggeredBy(fastOptJS in Compile)

spliceBrowsers <<= spliceBrowsers.triggeredBy(fastOptJS in Compile)

scalaJSStage in Global := FastOptStage