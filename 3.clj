(defn iter-primes
  [current-list limit position]
  (if (> (nth current-list position) (Math/sqrt limit))
    current-list
    (iter-primes (conj (filter (fn[x] (not= 0 
                                      (rem x
                                          (nth current-list position))))
                               current-list)
                       (nth current-list position))
                 limit
                 (+ 1 position))))
                 
(defn get-all-primes 
  [n]
  (iter-primes (range 2 n) n 0))

(defn prime-factors
  [n]
  (last (sort (filter (fn[x] (= 0 (rem n x)))
    (get-all-primes (/ n 2))))))
  