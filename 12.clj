(defn get-nth-triangle-number
  [n]
  (reduce + (range 1 (+ n 1))))
  
(defn get-num-divisors
  [x]
  (defn get-num-divisors-iter
    [x iter divisors previous-divisors]
    (cond (> iter (/ x 2))
          (conj divisors x)
          (= 0 (rem x iter))
          (recur x (+ iter 1) (conj divisors iter))
          :else
          (recur x (+ iter 1) divisors)))
  (get-num-divisors-iter x 1 ()))

(defn get-tri-div
  ([i num-divisors]
  (cond (> (count (get-num-divisors (get-nth-triangle-number i)))
           num-divisors)
           i
        :else
          (recur (+ i 1) num-divisors)))
  ([num-divisors]
  (get-tri-div 1, num-divisors)))
  
(defn create-divisors-map
  ([x divisors i]
  (cond (> i x)
        divisors
        :else
        (= 0 (rem i 2))
          (get )
        (recur x (conj divisors {i (get-num-divisors i)}) (+ i 1))))
  ([x]
  (create-divisors-map x {} 1)))
  

(get-divisor-map
  [x divisor-map i]
  (cond
    ;; if iterator is greater than x/2 return the map (because there are no factors greater than x/2) 
    (> i (/ x 2)))
      (get divisor-map x)      
    ;;  if x/i has no remainder, i is a factor. e.g 64/2 is a factor. 
    ;; this is the first time this is executed, so we know that i is the smallest factor!
    (= 0 (rem x i)
      ;; add to the divisor map. i is the first factor
      (cond
          ;; if we didn't know about x/i in the divisor map, and it in
          (nil? (get divisor-map) (/ x i))
            (recur x/i divisor-map 2)
          ;; if we do know about x/i in the divisor map, we need to add x to the x/i list and then try x/i+all factors less than x/i)
      (conj (get divisor-map (x/i)) i)
      )

;; take a number (1)
;;is it in the divisor map?
;;  no
    

;; To find all factors
;;  take 48
;;  48/2 = 24
;;  48s divisors include all of 24s divisors
;;  however, they also include 16
;;  We therefore need to check (assumption here) 24/2+each divisor
;;  13
;;  14
;;  15
;;  15
;;  18
;;  20
;;  24

;; Also, a number with 500 divisors must be at least the sum of 1-500


;; 38
;; /2
;; 19

;; we know loads of divisors
;; take a number
;; find all of its divisors
;;  count them
;;  > number?
;;  return
;; < number?
;;  try next divisors
;; list of numbers which could be divisors
;;  remove ones we know are divisors -> x/2

;; find smallest divisor
;; 28 => 2
;;  does x/smallest divisor exist in dictionary?
;;    yes
;;      return conj 28 divisors of 28/2
;;    no
;;      recur -> add 