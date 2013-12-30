(ns clojure-snippets-app.core
  (:gen-class)
  [:require [clojure-snippets-app.nums]]
  )



(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  (def x (clojure-snippets-app.nums/average 10))
  (println x))
