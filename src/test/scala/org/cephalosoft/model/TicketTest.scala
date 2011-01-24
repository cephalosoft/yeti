package org.cephalosoft.model {

import org.junit._
import Assert._
import org.cephalosoft.model.Ticket

class TicketTest {

  @Test def addItemToTicket() {
    var ticket: Ticket = new Ticket()
    ticket.item("Widget")
    assertEquals(ticket.item, "Widget")
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
