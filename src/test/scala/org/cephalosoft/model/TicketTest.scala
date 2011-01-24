package org.cephalosoft.model {

import org.junit._
import Assert._
import org.cephalosoft.model.Ticket

class TicketTest {

  @Test def addItemToTicket() {
    ticket = new Ticket()
    ticket.addItem("Widget")
    assertEquals(ticket.getItem(), "Widget")
  }
}
}
