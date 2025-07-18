|Resources|HTTP Verb|Resource URL                   |Use Representation                                   |
|---------|---------|-------------------------------|-----------------------------------------------------|
|Zoo      |GET      |/zoos                          |Lists all zoos                                       |
|Zoo      |GET      |/zoos/1                        |Lists areas of zoo 1                                 |
|Visitor  |GET      |zoos/1/vistors                 |Lists all visitors of zoo 1                          |
|Visitor  |GET      |zoos/1/vistors/1               |Info on visitor 1, actions visitor 1 can do          |
|Tickets  |POST     |zoos/1/tickets                 |New visitor buys a ticket for zoo 1                  |
|Tickets  |GET      |zoos/1/visitors/1/tickets/1    |Info on ticket 1 for visitor 1 in zoo 1              |
|Shop     |GET      |/zoos/1/shops                  |Lists all shops in zoo 1                             |
|Shop     |GET      |/zoos/1/shops/1                |Info on shop 1 in zoo 1                              |
|Shop     |GET      |/zoos/1/visitors/1/shops/1     |Info on what visitor 1 can do in shop 1 in zoo 1     |
|Shop     |POST     |/zoos/1/visitors/1/shops/1     |Visitor makes a purchase in shop 1                   |
|Enclosure|GET      |/zoos/1/enclosures             |Lists all enclosures of zoo 1                        |
|Enclosure|GET      |/zoos/1/visitors/1/enclosures/1|Info on what visitor 1 can do in enclosure 1 in zoo 1|
|Animal   |GET      |/zoos/1/animals                |Lists all animals in zoo 1                           |
|Animal   |GET      |/zoos/1/enclosures/1/animals   |Lists all animals in enclosure 1                     |
|Animal   |GET      |/zoos/1/animals/1              |Info on animal 1                                     |
|Hospital |GET      |/zoos/1/visitor/1/hospital     |Info on what visitor 1 can do in the zoo 1 hospital  |
