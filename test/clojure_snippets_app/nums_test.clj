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

(deftest factorial-test-normal-case
  (testing "Failed factorial test"
    (let [expected 24]
      (is (= expected (clojure-snippets-app.nums/factorial 4) ))
    )
  )
)

(deftest factorial-test-value-of-one
  (testing "Failed factorial test"
    (let [expected 1]
      (is (= expected (clojure-snippets-app.nums/factorial 1) ))
      )
  )
 )

(deftest factorial-test-negative-x
  (testing "Failed factorial test"
    (is (thrown? Throwable (clojure-snippets-app.nums/factorial -5)))
  )
)

