;;Clojure implementation of the Sieve of Eratosthenes method for finding primes
;;Call (get-all-primes n) to get all primes between 2 and n

(defn iter-primes
  [current-list limit position]
  (if (> (nth current-list position) (Math/sqrt limit))
    current-list
    (recur (conj (filter (fn[x] (not= 0 
                                      (rem x
                                          (nth current-list position))))
                               current-list)
                       (nth current-list position))
                 limit
                 (+ 1 position))))
                 
(defn get-all-primes 
  [n]
  (iter-primes (range 2 n) n 0))