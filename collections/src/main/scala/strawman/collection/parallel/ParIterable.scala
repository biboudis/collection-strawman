/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2003-2017, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

package scala
package collection.parallel

import scala.collection.GenIterable
import scala.collection.generic._
import scala.collection.parallel.mutable.ParArrayCombiner

/** A template trait for parallel iterable collections.
 *
 *  $paralleliterableinfo
 *
 *  $sideeffects
 *
 *  @tparam T    the element type of the collection
 *
 *  @author Aleksandar Prokopec
 *  @since 2.9
 */
trait ParIterable[+T]
extends IterableOnce[T] 
with ParIterableOps[A, ParIterable, ParIterable[A]] {

  def seq: Iterable[A]

}

// /** $factoryInfo
//  */
// object ParIterable extends ParFactory[ParIterable] {
//   implicit def canBuildFrom[T]: CanCombineFrom[Coll, T, ParIterable[T]] = new GenericCanCombineFrom[T]

//   def newBuilder[T]: Combiner[T, ParIterable[T]] = ParArrayCombiner[T]

//   def newCombiner[T]: Combiner[T, ParIterable[T]] = ParArrayCombiner[T]
// }

