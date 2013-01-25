# Roman Numerals Kata

Original: http://codingdojo.org/cgi-bin/wiki.pl?KataRomanNumerals

## Problem Description

The Romans were a clever bunch. They conquered most of Europe and ruled it for hundreds of years. They invented concrete and straight roads and even bikinis[1]. One thing they never discovered though was the number zero. This made writing and dating extensive histories of their exploits slightly more challenging, but the system of numbers they came up with is still in use today. For example the BBC uses Roman numerals to date their programmes.

The Romans wrote numbers using letters - I, V, X, L, C, D, M. (notice these letters have lots of straight lines and are hence easy to hack into stone tablets)

The Kata says you should write a function to convert from normal numbers to Roman Numerals: eg

```
     1 --> I
     10 --> X
     7 --> VII
```

For a full description of how it works, take a look at the following page, which includes an implementation of the Kata in Javascript: http://www.novaroma.org/via_romana/numbers.html

There is no need to be able to convert numbers larger than about 3000. (The Romans themselves didn't tend to go any higher)

Note that you can't write numerals like "IM" for 999. Wikipedia says: Modern Roman numerals ... are written by expressing each digit separately starting with the left most digit and skipping any digit with a value of zero. To see this in practice, consider the ... example of 1990. In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC. 2008 is written as 2000=MM, 8=VIII; or MMVIII.

### Part II of the Kata

Write a function to convert in the other direction, ie numeral to digit 

## Clues

* Can you make the code really beautiful and highly readable? 

* Does it help to break out lots of small named functions from the main function, or is it better to keep it all in one function? 

* If you don't know an algorithm to do this already, can you derive one using strict TDD? 

* Does the order you take the tests in affect the final design of your algorithm? 

* Would it be better to work out an algorithm first before starting with TDD? 

If you do know an algorithm already, can you implement it using strict TDD? 

* Can you think of another algorithm? 

* What are the best data structures for storing all the numeral letters? (I, V, D, M etc.) ?

* Can you define the test cases in a csv file and use FIT, or generate test cases in xUnit?

* What is the best way to verify your tests are correct? 

## Suggested Test Cases

Exercise left to the reader. You could use 1999 as an acceptance test. 