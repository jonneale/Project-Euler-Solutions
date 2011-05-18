(defn get-factors-fast
  [n]
  (* 2 (count (filter #(zero? (rem n %)) (range 1 (Math/sqrt n))))))
  
(defn get-factors
  [n]
  (conj (vec (get-factors-fast n (range 1 (+ 1 (/ n 2))))) n))

;;  Pretty slow so far:  
;;   (time (many-tri 200)) 
;;   "Elapsed time: 99650.65 msecs"
;;   2015
;; 
;; 10% increase by playing with the numbers
;; time (many-tri 200))
;; "Elapsed time: 90653.7 msecs"
;; 2015
                                        ;filter then first on a lazy-seq
