(ns clojure-snippets-app.javaops-test
  (:require [clojure.test :refer :all]
            [clojure-snippets-app.javaops :refer :all]))



(deftest process-list-test
  (testing "FIXME, I fail."
    (let [ result (clojure-snippets-app.javaops/list-processing "hello")]
      (println result)
      (is (= result '("hello") ))
    )
  )

)
