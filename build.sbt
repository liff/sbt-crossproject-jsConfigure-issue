import sbtcrossproject.CrossPlugin.autoImport.{CrossType, crossProject}


val good = crossProject(JVMPlatform, JSPlatform)
  .crossType(CrossType.Pure)
  .settings(scalaVersion := "2.12.8")
  .jsConfigure(identity)

val bad = crossProject(JVMPlatform, JSPlatform)
  .crossType(CrossType.Pure)
  .jsConfigure(identity)
  .settings(scalaVersion := "2.12.8")

