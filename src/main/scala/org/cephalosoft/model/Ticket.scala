package org.cephalosoft.model

import net.liftweb.mapper._
import net.liftweb.util._
import net.liftweb.common._

object TicketMetaData extends Ticket with KeyedMetaMapper[Long, Ticket] with CRUDify[Long, Ticket] {
  override def dbTableName = "tickets"
  override def fieldOrder = List(requestor, handler, item)
}

class Ticket extends KeyedMapper[Long, Ticket] {
  def getSingleton = TicketMetaData
  def primaryKeyField = id
  object id extends MappedLongIndex(this)
  object requestor extends MappedText(this)
  object handler extends MappedText(this)
  object item extends MappedText(this)
}
