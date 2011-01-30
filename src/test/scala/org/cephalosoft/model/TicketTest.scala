package org.cephalosoft.model {

import org.junit._
import Assert._
import bootstrap.liftweb._

class TicketTest {

  @Test def addItemToTicket() {
    InMemoryTestDB.init
    val ticket: Ticket = new Ticket()
    val item: Item = Item.create.number(12345).description("Widget")
    ticket.items += item
    ticket.save
    println("Goodbye")
    assertEquals(item.ticket, ticket.id)
    assertEquals(ticket.items.head.id, item.id)
  }
  
  @Test def addRequestorToTicket() {
    var ticket: Ticket = new Ticket()
    ticket.requestor("Benjamin")
    assertEquals(ticket.requestor, "Benjamin")
  }

  @Test def addHandlerToTicket() {
    var ticket: Ticket = new Ticket()
    ticket.handler("Jeremiah")
    assertEquals(ticket.handler, "Jeremiah")
  }
}
}
