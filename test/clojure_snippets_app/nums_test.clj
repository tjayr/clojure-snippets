(ns clojure-snippets-app.nums-test
  (:require [clojure.test :refer :all]
            [clojure-snippets-app.nums :refer :all]))

(deftest average-test
  (testing "FIXME, I fail."
    (let [expected 10 ]
      (is (= expected (clojure-snippets-app.nums/average [10 10 10 10])))
    )
  )
)


(deftest diamter-test
  (testing "FIXME, I fail."
    (let [expected 3.14]
      (is (= expected  (clojure-snippets-app.nums/calculate-diameter 1) ))
      )
    )
  )