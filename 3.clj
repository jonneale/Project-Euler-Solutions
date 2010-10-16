(defn iter-primes
  [current-list limit position]
  (if (>= position (count current-list))
    current-list
    (iter-primes (conj (filter (fn[x] (and (not= 0 
                                                (rem x
                                                (nth current-list position)))
                                          (= 0 (rem limit x))))
                               current-list)
                       (nth current-list position))
                 limit
                 (+ 1 position))))
                 
(defn find-largest-prime-factor 
  [n]
  (first (iter-primes (range 2 (Math/sqrt n)) n 0)))
  