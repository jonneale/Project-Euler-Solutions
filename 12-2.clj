(defn get-factors-fast
  [n numbers-to-try]
  (filter #(= 0 (rem n %1)) numbers-to-try))
  
(defn get-factors
  [n]
  (conj (get-factors-fast n (range 1 (+ 1 (/ n 2)))) n))

(defn tri-iter
  [current current-sum number-of-factors]
  
  (cond (<= number-of-factors (time (count (get-factors (+ current current-sum)))))
          (do (println "-----")
          current)
        :else
          (recur (+ current 1) (+ current current-sum) number-of-factors))))

(defn many-tri
  [number-of-factors]
  (tri-iter number-of-factors (reduce + (range 1 number-of-factors)) number-of-factors))

;;  Pretty slow so far:  
;;   (time (many-tri 200)) 
;;   "Elapsed time: 99650.65 msecs"
;;   2015
