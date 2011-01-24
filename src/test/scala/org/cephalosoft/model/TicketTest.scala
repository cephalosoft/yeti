package org.cephalosoft.model {

import org.junit._
import Assert._

class TicketTest {

  @Test def addItemToTicket() {
    val ticket: Ticket = new Ticket()
    val item: Item = Item.create.ticket(ticket).number(12345).description("Widget")
    item.save
    ticket.items += item
    ticket.save
    assertEquals(ticket.items.head.description, "Widget")
    assertEquals(ticket.items.head.number, 12345)
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
