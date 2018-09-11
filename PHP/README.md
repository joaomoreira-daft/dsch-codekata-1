# CodeKata 1 - Sing a song
Category: Refactoring

# Objective
Code to produce a popular children's nursery rhyme was produced by a web agency for the customer last year. The customer now desires to produce multiple different versions of the song using the same structure but based on different themes, for example a current popular children's movie featuring a cast of animals. The customer asks that you make the song configurable for different lists of animals. The customer cannot guarantee that there will be the same number of animals in each different version.

No documentation was provided by the previous developer and there is only one failing test :(

# Task
Refactor the code to allow for the customer's needs.
**Remember: refactoring can only be done in the presence of tests that are passing, and after refactoring the tests still pass!**

Requirements:
- have php installed in your machine (5.3+, macs will have it)
- have composer installed

example of how to run this source code:
- run `composer install`
- run `php src/index.php`, you should see the song being printed
- tests, run `php vendor/bin/phpunit tests/`
