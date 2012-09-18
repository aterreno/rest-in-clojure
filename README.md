# rest-in-clojure

Learning Clojure with Rest 

## Prerequisites

You will need [Leiningen][1] 1.7.0 or above installed.

[1]: https://github.com/technomancy/leiningen

## Running

To start a web server for the application, run:

    lein ring server

## Testing 
    lein test

    curl -i -H "Accept: application/json" http://localhost:3000/ 
    curl -i -H "Accept: application/json" -X PUT -d "name=toni" http://localhost:3000/

## License

Copyright © 2012 http://www.the-arm.com/


