(defn triangle
  [n]
  (/ (* n 
        (+ n 1)) 
     2))
     
(defn is-prime?
  [n]
  (= 0
    (count (filter #(= 0 
                       (rem n %1))
                   (range 3 n 2)))))
  
     
(defn all-primes
  []
  ;; (into (2)
        (filter #(is-prime? %1)
                 (iterate #(+ 2 %1) 3)))
     
;; To generate a list of primes could you do something like?
;; generate a seq of numbers which could be prime
;; (into '(2) (range 3 n 2))
;; filter them for actual primes
;; (filter )



(filter #(rem n %1) (range 3 n 2))