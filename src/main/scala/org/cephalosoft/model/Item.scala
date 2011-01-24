package org.cephalosoft.model

import net.liftweb.mapper._
import net.liftweb.util._
import net.liftweb.common._

object Item extends Item with LongKeyedMetaMapper[Item] with LongCRUDify[Item] {
  override def dbTableName = "items"
  override def fieldOrder = List(ticket, number, description)
}

class Item extends LongKeyedMapper[Item] {
  def getSingleton = Item
  def primaryKeyField = id
  object id extends MappedLongIndex(this)
  object ticket extends LongMappedMapper(this, Ticket)
  object number extends MappedLong(this)
  object description extends MappedText(this)
}
