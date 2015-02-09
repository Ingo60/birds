Birds
=====

A little interpreted language inspired by "How to Mock a Mockingbird".

It is possible to define combinators, derive SKI expressions for them and play around with it.

In fact, it is possible and even fun to write little programs.

> This project is also a showcase of how to use Sean Corfields great [leiningen plugin for frege](https://github.com/seancorfield/lein-fregec). (Note that there is not a single line of clojure, apart from the project file.)

Build and Run
=============

    lein uberjar
    java -jar bin/birds-0.1.0-SNAPSHOT-standalone.jar

With

    java -Dski.pure -jar bin/birds-0.1.0-SNAPSHOT-standalone.jar

you get the pure SKI calculus without additional predefined combinators.  There is a file `fac6.ski` 
that shows how to compute faculties in this mode.
