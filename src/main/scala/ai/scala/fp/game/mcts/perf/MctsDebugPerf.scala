package ai.scala.fp.game.mcts.perf

import ai.scala.fp.game.mcts.perf.DummyMcts._

object MctsDebugPerf {
  def main(args: Array[String]): Unit = {
    dummyRoot.steps(1000000)
  }

}
