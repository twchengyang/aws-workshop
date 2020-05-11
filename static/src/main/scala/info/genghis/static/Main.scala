package info.genghis.static

import cats.effect.{ExitCode, IO, IOApp}
import cats.implicits._

object Main extends IOApp {
  def run(args: List[String]) =
    StaticServer.stream[IO].compile.drain.as(ExitCode.Success)
}
