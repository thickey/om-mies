# Om-mies

A simple example setup of an project using om along with lein new mies.

# Using it
Following the [instructions from the om repo](https://github.com/swannodette/om#using-it), partially regurgitated here:

> You need to clone ClojureScript from master and install it via `script/build`.
> Then clone the Om repo and install it locally with `lein install`.

From there, to get my setup working I needed a little more then what is found in the om readme and use the [TodoMVC example `project.clj`](https://github.com/swannodette/todomvc/blob/om/labs/architecture-examples/om/project.clj) for guidance. The key here being the `:dependencies`  with one difference being the local om dependency needed to be:

    [om "0.1.0-SNAPSHOT"]
