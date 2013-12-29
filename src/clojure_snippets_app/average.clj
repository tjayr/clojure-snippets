;Function which calculates the average of some numbers
(defn average [numbers]
	(/ (apply + numbers) (count numbers))
)

;Function which checks if the average of a specified amount is less than 10
(defn gt-ten [amount]
   (if (> (average amount) 10)
	(println "result >= 10")
	(println "result <= 10")
   )
)

