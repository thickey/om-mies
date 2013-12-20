(defproject om-mies "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2127"]
                 [om "0.1.0-SNAPSHOT"]]

  :plugins [[lein-cljsbuild "1.0.0"]]

  :source-paths ["src"]

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :compiler {:output-to "om_mies.js"
                                   :output-dir "out"
                                   :optimizations :none
                                   :source-map true
                                   :externs ["om/externs/react.js"]}}]})
