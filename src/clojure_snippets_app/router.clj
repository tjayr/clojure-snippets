(ns clojure-snippets-app.router
  (:gen-class ))


(defn register-service [service]
  (println (concat "Register service with router " service))
  )


(defn de-register-service [service]
  (println (concat "Deregister service " service))
  )


(defn select-service [request]
  (println (concat "Select service for " request))
  )


