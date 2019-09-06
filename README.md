# Clojure HTTP Server on `Piku`

Illustrates how to create an uberjar for clojure projects using `lein`

## Installation

Clone with;
```bash
	git clone git@github:matrixjnr/sample-clojure-app.git
	git //change upstream url
	git remote add piku piku@your-server:sample-clojure-app
	git add .
	git commit -am "Your Message"
	git push piku master
```

## Usage

To run the uberjar:

    $ java -jar sample-clojure-app-0.1.0-standalone.jar

## Workers

A simple lazy worker has been included in this sample.
WSGI will use the default unix clock.

## Client

```
curl 0.0.0.0:9500
expect time as response
curl 127.0.0.1:9500
expect time as response
```


## License

Copyright © 2019 John Simiyu

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
