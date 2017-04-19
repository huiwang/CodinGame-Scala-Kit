package com.truelaurel.codingame.time

import scala.concurrent.duration.Duration

/**
  * Created by hwang on 12/02/2017.
  */
class Chronometer(duration: Duration) {
  val budget: Long = duration.toNanos
  private var startTime: Long = 0
  private var elapsed: Double = 0
  private var count: Long = 0
  private val margin: Double = 1.0

  def start(): Unit = startTime = System.nanoTime()

  def willOutOfTime: Boolean = {
    count += 1
    elapsed = System.nanoTime() - startTime
    budget - elapsed < margin * elapsed / count
  }

}