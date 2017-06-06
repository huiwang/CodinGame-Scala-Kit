package com.truelaurel.codingame.caribbean.offline

import com.truelaurel.codingame.caribbean.best.BestCaribbeanPlayer
import com.truelaurel.codingame.caribbean.common._
import com.truelaurel.codingame.caribbean.head.CaribbeanPlayer
import com.truelaurel.codingame.game.GameSimulator
import com.truelaurel.codingame.hexagons.Offset

/**
  * Created by hwang on 19/04/2017.
  */
object CaribbeanOfflineBattles {
  def main(args: Array[String]): Unit = {
    val games = Vector(
      CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(5, 7), 1, 0, 100, 1), 2 -> Ship(2, Offset(19, 2), 5, 0, 100, 1), 1 -> Ship(1, Offset(5, 13), 5, 0, 100, 0), 3 -> Ship(3, Offset(19, 18), 1, 0, 100, 0)), Map(10 -> Barrel(10, Offset(3, 10), 15), 24 -> Barrel(24, Offset(14, 12), 14), 25 -> Barrel(25, Offset(21, 5), 14), 14 -> Barrel(14, Offset(11, 17), 17), 20 -> Barrel(20, Offset(14, 15), 20), 21 -> Barrel(21, Offset(21, 6), 13), 13 -> Barrel(13, Offset(11, 3), 17), 17 -> Barrel(17, Offset(5, 1), 16), 22 -> Barrel(22, Offset(21, 14), 13), 12 -> Barrel(12, Offset(20, 14), 19), 18 -> Barrel(18, Offset(5, 19), 16), 16 -> Barrel(16, Offset(6, 16), 20), 11 -> Barrel(11, Offset(20, 6), 19), 26 -> Barrel(26, Offset(21, 15), 14), 23 -> Barrel(23, Offset(14, 8), 14), 19 -> Barrel(19, Offset(14, 5), 20), 15 -> Barrel(15, Offset(6, 4), 20)), Map(), Map(4 -> Mine(4, Offset(16, 3)), 8 -> Mine(8, Offset(1, 7))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(1, 4), 2, 0, 100, 1), 2 -> Ship(2, Offset(19, 1), 1, 0, 100, 1), 1 -> Ship(1, Offset(1, 16), 4, 0, 100, 0), 3 -> Ship(3, Offset(19, 19), 5, 0, 100, 0)), Map(14 -> Barrel(14, Offset(2, 2), 14), 20 -> Barrel(20, Offset(9, 4), 20), 21 -> Barrel(21, Offset(9, 16), 20), 13 -> Barrel(13, Offset(6, 10), 12), 17 -> Barrel(17, Offset(21, 15), 19), 22 -> Barrel(22, Offset(9, 9), 16), 18 -> Barrel(18, Offset(9, 3), 14), 16 -> Barrel(16, Offset(21, 5), 19), 23 -> Barrel(23, Offset(9, 11), 16), 19 -> Barrel(19, Offset(9, 17), 14), 15 -> Barrel(15, Offset(2, 18), 14)), Map(), Map(10 -> Mine(10, Offset(19, 5))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(3, 4), 4, 0, 100, 1), 1 -> Ship(1, Offset(3, 16), 2, 0, 100, 0)), Map(24 -> Barrel(24, Offset(16, 10), 13), 25 -> Barrel(25, Offset(2, 10), 13), 14 -> Barrel(14, Offset(16, 18), 10), 20 -> Barrel(20, Offset(4, 13), 17), 29 -> Barrel(29, Offset(18, 9), 16), 28 -> Barrel(28, Offset(10, 17), 14), 13 -> Barrel(13, Offset(16, 2), 10), 32 -> Barrel(32, Offset(17, 12), 10), 17 -> Barrel(17, Offset(10, 9), 12), 22 -> Barrel(22, Offset(18, 4), 18), 27 -> Barrel(27, Offset(10, 3), 14), 12 -> Barrel(12, Offset(7, 14), 16), 18 -> Barrel(18, Offset(10, 11), 12), 16 -> Barrel(16, Offset(3, 18), 16), 31 -> Barrel(31, Offset(17, 8), 10), 11 -> Barrel(11, Offset(7, 6), 16), 23 -> Barrel(23, Offset(18, 16), 18), 30 -> Barrel(30, Offset(18, 11), 16), 19 -> Barrel(19, Offset(4, 7), 17), 15 -> Barrel(15, Offset(3, 2), 16)), Map(), Map(), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(4, 8), 5, 0, 100, 1), 1 -> Ship(1, Offset(4, 12), 1, 0, 100, 0)), Map(24 -> Barrel(24, Offset(2, 11), 19), 25 -> Barrel(25, Offset(1, 2), 11), 14 -> Barrel(14, Offset(20, 12), 14), 20 -> Barrel(20, Offset(8, 13), 15), 28 -> Barrel(28, Offset(6, 13), 20), 21 -> Barrel(21, Offset(11, 4), 16), 13 -> Barrel(13, Offset(20, 8), 14), 17 -> Barrel(17, Offset(6, 5), 12), 22 -> Barrel(22, Offset(11, 16), 16), 27 -> Barrel(27, Offset(6, 7), 20), 18 -> Barrel(18, Offset(6, 15), 12), 16 -> Barrel(16, Offset(11, 14), 13), 26 -> Barrel(26, Offset(1, 18), 11), 23 -> Barrel(23, Offset(2, 9), 19), 19 -> Barrel(19, Offset(8, 7), 15), 15 -> Barrel(15, Offset(11, 6), 13)), Map(), Map(8 -> Mine(8, Offset(8, 8))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(2, 6), 0, 0, 100, 1), 5 -> Ship(5, Offset(19, 14), 4, 0, 100, 0), 1 -> Ship(1, Offset(2, 14), 0, 0, 100, 0), 2 -> Ship(2, Offset(9, 1), 1, 0, 100, 1), 3 -> Ship(3, Offset(9, 19), 5, 0, 100, 0), 4 -> Ship(4, Offset(19, 6), 2, 0, 100, 1)), Map(24 -> Barrel(24, Offset(6, 9), 11), 25 -> Barrel(25, Offset(6, 11), 11), 14 -> Barrel(14, Offset(5, 3), 11), 20 -> Barrel(20, Offset(17, 1), 19), 21 -> Barrel(21, Offset(17, 19), 19), 17 -> Barrel(17, Offset(4, 11), 18), 22 -> Barrel(22, Offset(18, 9), 18), 27 -> Barrel(27, Offset(11, 19), 15), 18 -> Barrel(18, Offset(17, 2), 11), 16 -> Barrel(16, Offset(4, 9), 18), 26 -> Barrel(26, Offset(11, 1), 15), 23 -> Barrel(23, Offset(18, 11), 18), 19 -> Barrel(19, Offset(17, 18), 11), 15 -> Barrel(15, Offset(5, 17), 11)), Map(), Map(10 -> Mine(10, Offset(15, 4)), 6 -> Mine(6, Offset(11, 6)), 13 -> Mine(13, Offset(16, 11)), 12 -> Mine(12, Offset(16, 9)), 8 -> Mine(8, Offset(1, 1))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(4, 2), 3, 0, 100, 1), 1 -> Ship(1, Offset(4, 18), 3, 0, 100, 0)), Map(24 -> Barrel(24, Offset(2, 2), 16), 25 -> Barrel(25, Offset(2, 18), 16), 14 -> Barrel(14, Offset(15, 18), 10), 20 -> Barrel(20, Offset(18, 19), 15), 29 -> Barrel(29, Offset(2, 16), 15), 28 -> Barrel(28, Offset(2, 4), 15), 33 -> Barrel(33, Offset(7, 15), 18), 13 -> Barrel(13, Offset(15, 2), 10), 32 -> Barrel(32, Offset(7, 5), 18), 34 -> Barrel(34, Offset(18, 4), 16), 17 -> Barrel(17, Offset(19, 9), 13), 22 -> Barrel(22, Offset(16, 5), 20), 27 -> Barrel(27, Offset(6, 12), 18), 12 -> Barrel(12, Offset(12, 10), 12), 35 -> Barrel(35, Offset(18, 16), 16), 18 -> Barrel(18, Offset(19, 11), 13), 16 -> Barrel(16, Offset(21, 16), 10), 31 -> Barrel(31, Offset(2, 12), 13), 26 -> Barrel(26, Offset(6, 8), 18), 23 -> Barrel(23, Offset(16, 15), 20), 30 -> Barrel(30, Offset(2, 8), 13), 19 -> Barrel(19, Offset(18, 1), 15), 15 -> Barrel(15, Offset(21, 4), 10)), Map(), Map(10 -> Mine(10, Offset(4, 1))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(3, 2), 5, 0, 100, 1), 2 -> Ship(2, Offset(16, 2), 0, 0, 100, 1), 1 -> Ship(1, Offset(3, 18), 1, 0, 100, 0), 3 -> Ship(3, Offset(16, 18), 0, 0, 100, 0)), Map(24 -> Barrel(24, Offset(15, 4), 14), 25 -> Barrel(25, Offset(15, 16), 14), 14 -> Barrel(14, Offset(6, 4), 17), 20 -> Barrel(20, Offset(7, 12), 17), 29 -> Barrel(29, Offset(14, 13), 18), 28 -> Barrel(28, Offset(14, 7), 18), 21 -> Barrel(21, Offset(9, 8), 10), 13 -> Barrel(13, Offset(7, 14), 19), 17 -> Barrel(17, Offset(6, 18), 10), 22 -> Barrel(22, Offset(9, 12), 10), 27 -> Barrel(27, Offset(20, 11), 12), 12 -> Barrel(12, Offset(7, 6), 19), 18 -> Barrel(18, Offset(16, 10), 16), 16 -> Barrel(16, Offset(6, 2), 10), 31 -> Barrel(31, Offset(8, 17), 17), 26 -> Barrel(26, Offset(20, 9), 12), 23 -> Barrel(23, Offset(18, 10), 18), 30 -> Barrel(30, Offset(8, 3), 17), 19 -> Barrel(19, Offset(7, 8), 17), 15 -> Barrel(15, Offset(6, 16), 17)), Map(), Map(6 -> Mine(6, Offset(18, 3)), 8 -> Mine(8, Offset(16, 7))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(1, 3), 2, 0, 100, 1), 2 -> Ship(2, Offset(16, 4), 1, 0, 100, 1), 1 -> Ship(1, Offset(1, 17), 4, 0, 100, 0), 3 -> Ship(3, Offset(16, 16), 5, 0, 100, 0)), Map(10 -> Barrel(10, Offset(6, 1), 15), 24 -> Barrel(24, Offset(14, 6), 14), 25 -> Barrel(25, Offset(14, 14), 14), 14 -> Barrel(14, Offset(10, 8), 16), 20 -> Barrel(20, Offset(5, 2), 18), 29 -> Barrel(29, Offset(20, 3), 10), 28 -> Barrel(28, Offset(3, 11), 19), 21 -> Barrel(21, Offset(5, 18), 18), 13 -> Barrel(13, Offset(13, 15), 16), 17 -> Barrel(17, Offset(9, 19), 11), 22 -> Barrel(22, Offset(7, 9), 15), 27 -> Barrel(27, Offset(3, 9), 19), 12 -> Barrel(12, Offset(13, 5), 16), 18 -> Barrel(18, Offset(16, 5), 18), 16 -> Barrel(16, Offset(9, 1), 11), 31 -> Barrel(31, Offset(9, 10), 15), 11 -> Barrel(11, Offset(6, 19), 15), 26 -> Barrel(26, Offset(7, 10), 16), 23 -> Barrel(23, Offset(7, 11), 15), 30 -> Barrel(30, Offset(20, 17), 10), 19 -> Barrel(19, Offset(16, 15), 18), 15 -> Barrel(15, Offset(10, 12), 16)), Map(), Map(8 -> Mine(8, Offset(5, 4))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(12, 1), 1, 0, 100, 1), 1 -> Ship(1, Offset(12, 19), 5, 0, 100, 0)), Map(10 -> Barrel(10, Offset(17, 15), 11), 24 -> Barrel(24, Offset(13, 17), 15), 14 -> Barrel(14, Offset(11, 12), 13), 20 -> Barrel(20, Offset(15, 15), 20), 21 -> Barrel(21, Offset(18, 3), 20), 9 -> Barrel(9, Offset(17, 5), 11), 13 -> Barrel(13, Offset(11, 8), 13), 17 -> Barrel(17, Offset(11, 7), 14), 22 -> Barrel(22, Offset(18, 17), 20), 12 -> Barrel(12, Offset(4, 14), 15), 18 -> Barrel(18, Offset(11, 13), 14), 16 -> Barrel(16, Offset(21, 15), 19), 11 -> Barrel(11, Offset(4, 6), 15), 23 -> Barrel(23, Offset(13, 3), 15), 19 -> Barrel(19, Offset(15, 5), 20), 15 -> Barrel(15, Offset(21, 5), 19)), Map(), Map(4 -> Mine(4, Offset(10, 5))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(3, 2), 3, 0, 100, 1), 2 -> Ship(2, Offset(14, 8), 3, 0, 100, 1), 1 -> Ship(1, Offset(3, 18), 3, 0, 100, 0), 3 -> Ship(3, Offset(14, 12), 3, 0, 100, 0)), Map(24 -> Barrel(24, Offset(8, 11), 17), 37 -> Barrel(37, Offset(1, 12), 19), 14 -> Barrel(14, Offset(15, 11), 15), 20 -> Barrel(20, Offset(21, 12), 17), 29 -> Barrel(29, Offset(17, 11), 18), 28 -> Barrel(28, Offset(17, 9), 18), 21 -> Barrel(21, Offset(13, 7), 18), 33 -> Barrel(33, Offset(3, 13), 20), 13 -> Barrel(13, Offset(15, 9), 15), 32 -> Barrel(32, Offset(3, 7), 20), 34 -> Barrel(34, Offset(19, 2), 15), 17 -> Barrel(17, Offset(11, 6), 12), 22 -> Barrel(22, Offset(13, 13), 18), 27 -> Barrel(27, Offset(16, 13), 10), 12 -> Barrel(12, Offset(2, 10), 15), 35 -> Barrel(35, Offset(19, 18), 15), 18 -> Barrel(18, Offset(11, 14), 12), 16 -> Barrel(16, Offset(17, 12), 19), 31 -> Barrel(31, Offset(17, 18), 17), 26 -> Barrel(26, Offset(16, 7), 10), 23 -> Barrel(23, Offset(8, 9), 17), 36 -> Barrel(36, Offset(1, 8), 19), 30 -> Barrel(30, Offset(17, 2), 17), 19 -> Barrel(19, Offset(21, 8), 17), 15 -> Barrel(15, Offset(17, 8), 19)), Map(), Map(4 -> Mine(4, Offset(1, 3)), 8 -> Mine(8, Offset(3, 3)), 11 -> Mine(11, Offset(11, 11)), 10 -> Mine(10, Offset(11, 9))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(6, 5), 0, 0, 100, 1), 2 -> Ship(2, Offset(21, 2), 5, 0, 100, 1), 1 -> Ship(1, Offset(6, 15), 0, 0, 100, 0), 3 -> Ship(3, Offset(21, 18), 1, 0, 100, 0)), Map(24 -> Barrel(24, Offset(8, 17), 10), 25 -> Barrel(25, Offset(6, 7), 20), 14 -> Barrel(14, Offset(4, 9), 13), 20 -> Barrel(20, Offset(20, 3), 11), 29 -> Barrel(29, Offset(12, 6), 15), 28 -> Barrel(28, Offset(13, 17), 20), 21 -> Barrel(21, Offset(20, 17), 11), 13 -> Barrel(13, Offset(14, 18), 15), 17 -> Barrel(17, Offset(1, 16), 16), 27 -> Barrel(27, Offset(13, 3), 20), 12 -> Barrel(12, Offset(14, 2), 15), 18 -> Barrel(18, Offset(21, 4), 13), 16 -> Barrel(16, Offset(1, 4), 16), 26 -> Barrel(26, Offset(6, 13), 20), 23 -> Barrel(23, Offset(8, 3), 10), 30 -> Barrel(30, Offset(12, 14), 15), 19 -> Barrel(19, Offset(21, 16), 13), 15 -> Barrel(15, Offset(4, 11), 13)), Map(), Map(4 -> Mine(4, Offset(3, 5)), 10 -> Mine(10, Offset(3, 2))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(3, 6), 5, 0, 100, 1), 5 -> Ship(5, Offset(17, 17), 5, 0, 100, 0), 1 -> Ship(1, Offset(3, 14), 1, 0, 100, 0), 2 -> Ship(2, Offset(9, 8), 2, 0, 100, 1), 3 -> Ship(3, Offset(9, 12), 4, 0, 100, 0), 4 -> Ship(4, Offset(17, 3), 1, 0, 100, 1)), Map(24 -> Barrel(24, Offset(21, 12), 16), 20 -> Barrel(20, Offset(13, 18), 15), 29 -> Barrel(29, Offset(13, 16), 14), 28 -> Barrel(28, Offset(13, 4), 14), 21 -> Barrel(21, Offset(16, 1), 15), 17 -> Barrel(17, Offset(6, 11), 19), 22 -> Barrel(22, Offset(16, 19), 15), 27 -> Barrel(27, Offset(10, 12), 10), 16 -> Barrel(16, Offset(6, 9), 19), 26 -> Barrel(26, Offset(10, 8), 10), 23 -> Barrel(23, Offset(21, 8), 16), 19 -> Barrel(19, Offset(13, 2), 15)), Map(), Map(8 -> Mine(8, Offset(20, 8)), 10 -> Mine(10, Offset(12, 4)), 12 -> Mine(12, Offset(20, 3)), 14 -> Mine(14, Offset(3, 2))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(5, 1), 4, 0, 100, 1), 5 -> Ship(5, Offset(17, 16), 1, 0, 100, 0), 1 -> Ship(1, Offset(5, 19), 2, 0, 100, 0), 2 -> Ship(2, Offset(12, 7), 5, 0, 100, 1), 3 -> Ship(3, Offset(12, 13), 1, 0, 100, 0), 4 -> Ship(4, Offset(17, 4), 5, 0, 100, 1)), Map(24 -> Barrel(24, Offset(10, 17), 19), 37 -> Barrel(37, Offset(10, 7), 17), 25 -> Barrel(25, Offset(9, 7), 14), 14 -> Barrel(14, Offset(11, 17), 14), 20 -> Barrel(20, Offset(3, 19), 11), 28 -> Barrel(28, Offset(12, 16), 20), 38 -> Barrel(38, Offset(10, 13), 17), 21 -> Barrel(21, Offset(9, 6), 10), 33 -> Barrel(33, Offset(13, 3), 13), 13 -> Barrel(13, Offset(11, 3), 14), 32 -> Barrel(32, Offset(2, 10), 13), 34 -> Barrel(34, Offset(13, 17), 13), 17 -> Barrel(17, Offset(15, 7), 12), 22 -> Barrel(22, Offset(9, 14), 10), 27 -> Barrel(27, Offset(12, 4), 20), 35 -> Barrel(35, Offset(14, 3), 19), 18 -> Barrel(18, Offset(15, 13), 12), 16 -> Barrel(16, Offset(10, 18), 11), 31 -> Barrel(31, Offset(8, 19), 16), 26 -> Barrel(26, Offset(9, 13), 14), 23 -> Barrel(23, Offset(10, 3), 19), 36 -> Barrel(36, Offset(14, 17), 19), 30 -> Barrel(30, Offset(8, 1), 16), 19 -> Barrel(19, Offset(3, 1), 11), 15 -> Barrel(15, Offset(10, 2), 11)), Map(), Map(6 -> Mine(6, Offset(11, 4)), 9 -> Mine(9, Offset(19, 2)), 11 -> Mine(11, Offset(16, 4))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(4, 3), 4, 0, 100, 1), 5 -> Ship(5, Offset(21, 12), 1, 0, 100, 0), 1 -> Ship(1, Offset(4, 17), 2, 0, 100, 0), 2 -> Ship(2, Offset(11, 3), 1, 0, 100, 1), 3 -> Ship(3, Offset(11, 17), 5, 0, 100, 0), 4 -> Ship(4, Offset(21, 8), 5, 0, 100, 1)), Map(24 -> Barrel(24, Offset(14, 17), 20), 37 -> Barrel(37, Offset(13, 12), 17), 25 -> Barrel(25, Offset(4, 2), 12), 14 -> Barrel(14, Offset(20, 6), 20), 29 -> Barrel(29, Offset(6, 10), 12), 28 -> Barrel(28, Offset(18, 19), 13), 38 -> Barrel(38, Offset(21, 5), 14), 21 -> Barrel(21, Offset(5, 3), 19), 33 -> Barrel(33, Offset(5, 11), 12), 32 -> Barrel(32, Offset(5, 9), 12), 17 -> Barrel(17, Offset(15, 17), 11), 22 -> Barrel(22, Offset(5, 17), 19), 27 -> Barrel(27, Offset(18, 1), 13), 39 -> Barrel(39, Offset(21, 15), 14), 35 -> Barrel(35, Offset(5, 10), 12), 18 -> Barrel(18, Offset(8, 7), 12), 16 -> Barrel(16, Offset(15, 3), 11), 31 -> Barrel(31, Offset(4, 14), 13), 26 -> Barrel(26, Offset(4, 18), 12), 23 -> Barrel(23, Offset(14, 3), 20), 36 -> Barrel(36, Offset(13, 8), 17), 30 -> Barrel(30, Offset(4, 6), 13), 19 -> Barrel(19, Offset(8, 13), 12), 15 -> Barrel(15, Offset(20, 14), 20)), Map(), Map(8 -> Mine(8, Offset(18, 5)), 10 -> Mine(10, Offset(6, 4)), 12 -> Mine(12, Offset(7, 4))), 1)
      , CaribbeanState(CaribbeanContext(Map(), Map()), Map(0 -> Ship(0, Offset(6, 5), 5, 0, 100, 1), 2 -> Ship(2, Offset(12, 8), 1, 0, 100, 1), 1 -> Ship(1, Offset(6, 15), 1, 0, 100, 0), 3 -> Ship(3, Offset(12, 12), 5, 0, 100, 0)), Map(24 -> Barrel(24, Offset(2, 6), 12), 25 -> Barrel(25, Offset(2, 14), 12), 14 -> Barrel(14, Offset(15, 7), 13), 20 -> Barrel(20, Offset(6, 9), 14), 21 -> Barrel(21, Offset(6, 11), 14), 13 -> Barrel(13, Offset(16, 16), 13), 17 -> Barrel(17, Offset(10, 18), 13), 22 -> Barrel(22, Offset(12, 2), 13), 12 -> Barrel(12, Offset(16, 4), 13), 18 -> Barrel(18, Offset(11, 8), 10), 16 -> Barrel(16, Offset(10, 2), 13), 11 -> Barrel(11, Offset(18, 10), 11), 23 -> Barrel(23, Offset(12, 18), 13), 19 -> Barrel(19, Offset(11, 12), 10), 15 -> Barrel(15, Offset(15, 13), 13)), Map(), Map(5 -> Mine(5, Offset(13, 13)), 4 -> Mine(4, Offset(13, 7)), 6 -> Mine(6, Offset(16, 8)), 8 -> Mine(8, Offset(16, 6))), 1)
    )
    GameSimulator.evaluateOffline(
      games.flatMap(g => (0 until 5).map(_ => g)),
      CaribbeanArena,
      Vector(CaribbeanPlayer(CaribbeanContext.me, CaribbeanContext.other), BestCaribbeanPlayer(CaribbeanContext.other, CaribbeanContext.me)),
      200
    )
  }
}