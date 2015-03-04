![screenshot](https://raw.github.com/ics-software-engineering/play-example-fluentlenium/master/doc/play-example-fluentlenium-screenshot.png)

A example Play application illustrating the use of [Fluentlenium](https://github.com/FluentLenium/FluentLenium) for testing. 

Key Points
----------

  * No installation required (Fluentlenium jar files in default Play distribution).

  * Uses the Page Object Pattern ([test/pages/IndexPage.java](https://github.com/ics-software-engineering/play-example-fluentlenium/blob/master/test/test/pages/IndexPage.java)).

  * Provides the id attribute in HTML tags to facilitate testing.

  * Example test case ([test/IntegrationTest.java](https://github.com/ics-software-engineering/play-example-fluentlenium/blob/master/test/test/IntegrationTest.java)) shows how to select an item from a pulldown menu.

  * Testing sample code at [Fluentlenium documentation page](https://github.com/FluentLenium/FluentLenium#what-is-fluentlenium-)
  
Usage
-----

Download the system, then invoke `activator test` to run the fluentlenium tests:

```shell
[~/projecthosting/github/play/play-example-fluentlenium]-> activator test
[info] Loading project definition from /Users/johnson/projecthosting/github/play/play-example-fluentlenium/project
[info] Set current project to play-example-fluentlenium (in build file:/Users/johnson/projecthosting/github/play/play-example-fluentlenium/)
[info] Compiling 4 Java sources to /Users/johnson/projecthosting/github/play/play-example-fluentlenium/target/scala-2.11/test-classes...
[info] Passed: Total 1, Failed 0, Errors 0, Passed 1
[success] Total time: 6 s, completed Mar 3, 2015 3:52:18 PM
```

To better understand the behavior of the system, you can invoke `activator run` then go to http://localhost:9000/ to see the system behavior interactively.

Screencast
----------

Click the image below to watch a 13 minute walkthrough of this example. (Note that the code has been
slightly modified since this screencast to work with more recent releases of Play.)

[<img src="https://raw.github.com/ics-software-engineering/play-example-fluentlenium/master/doc/play-example-fluentlenium-youtube.png" width="400">](https://www.youtube.com/watch?v=diVhWRtJuxU)

Comments? Questions?
--------------------

Please create a [github issue](https://github.com/ics-software-engineering/play-example-fluentlenium/issues).

Revision History
----------------

  * March 3, 2015: Update to Play 2.3.7, provide IntelliJ project files.
  * November 29, 2013: Update to Play 2.2.0, remove checkstyle errors.
  * May 5, 2013: Initial release for Play 2.1.0.
