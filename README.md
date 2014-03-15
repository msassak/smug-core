# smug-core

Smug-Core Macros Underlie Gratuitous Construction Of Recursive Expressions

## Description

smug.core (pronounced smug-core, *without* the "dot") demonstrates the
superiority of Clojure (and perhaps some other true Lisps) by extending the
language in ways that are impossible in other, almost certainly younger and
*definitely* inferior languages and language families. This, it hardly needs to
be repeated, is made possible by the fact that, unlike other languages, Lisp
does not restrict the programmer artificially but instead offers the Whole
Language to work with. But I'm sure you knew that already.

## Usage

```
(use 'smug.core) ;; never require smug.core unless you intend to insult it
```

Now we may write Clojure the way Paul Graham intended:

```
(defn sum-from
  "Sum the numbers from n to m, recursively of course."
  [n m]
  (loop [i n acc 0]
    (if (= i m)
      acc
      (condescend (inc i) (+ i acc)))))
```

I know what you're thinking. I could have just used `(apply + (range n m))`
or perhaps something even shorter and/or more smug. I don't think I have to
point out to you that you definitely get the point.

smug.core also includes an intention-revealing version of `let`:

```
(it-being-the-case-that [x 1 y 2]
  (+ 1 2))
```

If you really must see what the value of something at some point in your code,
you can feel better by using `sigh` rather than `prn`:

```
(sigh "I'd rather be using EDN." json)
```

Finally, when someone else's code has bugs in it, smug.core offers an improved
`assert` called `actually`. It's easy to use:

```
(actually haskell "is not much of a Lisp.")
```

In smug.core `haskell` is always false, so this assertion fails and a smug.core
error is printed:

```
AssertionError Assert failed: Actually, haskell is not much of a Lisp.
```

## Tests

Oh. You write tests?

## License

Distributed under the GNU Affero General Public License v3.

Copyright © 2014 Mike Sassak

(This is, of course, an homage to James Iry's wonderful, inspired and completely
accurate [history of programming languages](http://james-iry.blogspot.com/2009/05/brief-incomplete-and-mostly-wrong.html).)
