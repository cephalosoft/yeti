package org.cephalosoft.model

import net.liftweb.mapper._
import net.liftweb.util._
import net.liftweb.common._

object Ticket extends Ticket with KeyedMetaMapper[Long, Ticket] with CRUDify[Long, Ticket] {
  override def dbTableName = "tickets"
}

class Ticket extends KeyedMapper[Long, Ticket] with OneToMany [Long, Ticket]{
  def getSingleton = Ticket
  def primaryKeyField = id
  object id extends MappedLongIndex(this)
  object requestor extends MappedText(this)
  object handler extends MappedText(this)
  object items extends MappedOneToMany(Item, Item.ticket, OrderBy(Item.id, Ascending))
}
