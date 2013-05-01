<img href="https://raw.github.com/ics-software-engineering/play-example-fluentlenium/gh-pages/images/play-example-fluentlenium-screenshot.png" width="500px" />

A simple Play application illustrating the use of Fluentlenium for testing. Illustrates:

  * Page Object Pattern (test/pages/IndexPage.java)
  * How to select an item from a pulldown menu as part of a test case (test/IntegrationTest.java)
  
Usage
-----

Download the system, then invoke `play test` to see the output:

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

To understand the behavior of the system, invoke `play run` then go to http://localhost:9000/.
