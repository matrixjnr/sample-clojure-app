(ns sample-clojure-app.worker
  (:gen-class))

(defn dostuff []
  (do
    (print "I'm doing lazy work\n")
  		(print "Resting for 10 seconds\n")
    (flush)))

		(loop [x 1]
  		(when (< x 10)
  				(dostuff)
  				(Thread/sleep 10000)
    		(recur (+ x 1))))