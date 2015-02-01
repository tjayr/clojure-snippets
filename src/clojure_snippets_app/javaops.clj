(ns clojure-snippets-app.javaops
  (:gen-class)
)

(defn list-processing [item]
  (def alist (new java.util.ArrayList))
  (.add alist item)
  (into () alist)

)
