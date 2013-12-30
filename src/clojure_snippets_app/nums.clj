(ns clojure-snippets-app.nums
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

(defn hello [name]
  (println name)
  )

