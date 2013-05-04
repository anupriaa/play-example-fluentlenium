![screenshot](https://raw.github.com/ics-software-engineering/play-example-fluentlenium/master/doc/play-example-fluentlenium-screenshot.png)

A example Play application illustrating the use of [Fluentlenium](https://github.com/FluentLenium/FluentLenium) for testing. GitHub Home Page is [here](http://ics-software-engineering.github.io/play-example-fluentlenium/). 

Key Points
----------

  * No installation required (Fluentlenium jar files in default Play distribution)
  * Use Page Object Pattern (test/pages/IndexPage.java)
  * Provide id attribute in HTML tags to facilitate testing.
  * Example test case (test/IntegrationTest.java) shows how to select an item from a pulldown menu.
  * Testing sample code at [Fluentlenium documentation page](https://github.com/FluentLenium/FluentLenium#what-is-fluentlenium-)
  
Usage
-----

Download the system, then invoke `play test` to run the fluentlenium tests:

```shell
[~/projecthosting/github/play-example-fluentlenium]-> play test
[info] Loading project definition from /Users/johnson/projecthosting/github/play-example-fluentlenium/project
[info] Set current project to play-example-fluentlenium (in build file:/Users/johnson/projecthosting/github/play-example-fluentlenium/)
[info] Compiling 1 Java source to /Users/johnson/projecthosting/github/play-example-fluentlenium/target/scala-2.10/test-classes...
[info] IntegrationTest
[info] + IntegrationTest.test
[info] 
[info] 
[info] Total for test IntegrationTest
[info] Finished in 0.014 seconds
[info] 1 tests, 0 failures, 0 errors
[info] Passed: : Total 1, Failed 0, Errors 0, Passed 1, Skipped 0
[success] Total time: 8 s, completed May 1, 2013 12:58:11 PM
```

To better understand the behavior of the system, you can invoke `play run` then go to http://localhost:9000/ to see the system behavior interactively.

Screencast
----------

Click the image below to watch a 13 minute walkthrough of this example:

[<img src="https://raw.github.com/ics-software-engineering/play-example-fluentlenium/master/doc/play-example-fluentlenium-youtube.png" width="400">](https://www.youtube.com/watch?v=diVhWRtJuxU)

Comments? Questions?
--------------------

Please create a [github issue](https://github.com/ics-software-engineering/play-example-fluentlenium/issues).

Revision History
----------------

  * May 5, 2013: Initial release for Play 2.1.0. 
