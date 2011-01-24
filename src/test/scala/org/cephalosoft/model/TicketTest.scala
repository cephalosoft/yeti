package org.cephalosoft.model {

import org.junit._
import Assert._
import org.cephalosoft.model.Ticket

class TicketTest {

  @Test def addItemToTicket() {
    var ticket: Ticket = new Ticket()
    assertEquals(ticket.item, "Widget")
  }
}
}
