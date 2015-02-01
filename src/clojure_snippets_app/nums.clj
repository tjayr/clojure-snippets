(ns clojure-snippets-app.nums
  (require [clojure.string])
  (:gen-class))

(defn average [numbers]
  "Function which calculates the average of some numbers"
  (/ (apply + numbers) (count numbers))
  )

(defn gt-ten [amount]
  "Function which checks if the average of a specified amount is less than 10"
  (if (> (average amount) 10)
    (println "result >= 10")
    (println "result <= 10")
    )
  )

(defn calculate-diameter [radius]
  "Calculates the diameter of a sphere given the radius"
  (let [pi 3.14]
    (* pi (* radius radius))
    )
  )

(defn multi-param
  ([x] (multi-param x 1))
  ([x y] (+ x y))
  )


(def strange-adder
  (fn adder-self-reference
    ([x] (adder-self-reference x 1))
    ([x y] (+ x y))
    )
  )


(defn sum-down-from [sum x]
  (if (pos? x)
    (recur (+ sum x) (dec x))
    sum))


(defn factorial [x]

  (if (neg? x)
    (throw (Throwable. "Value of X cannot be negative for a factorial"))
    )

  (loop [num x
         result_one 1
         ]
    (if (= num 1)
      result_one
      (recur (dec num) (* result_one num))
      )
    )
  )

(defn print-last-name [{:keys [lname]}]
  (println lname)
  )


(defn list-comp [data]
  (for [item (data)
        :when (> 0 item)]
    item
    )
  )


(defn randomize-list [data]
  (reduce #(+ % %2)
    (map #(* % (rand 1)) data))
  )


(defn factorial [x accum]
  (if (> x 0)
    (recur (dec x) (+ accum (* x (dec x))))
    accum))

(defn factorial [initialY]
  (loop [x initialY, accum 0]
    (if (> x 0)
      (recur (dec x) (+ accum (* x (dec x))))
      accum)))



