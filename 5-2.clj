; 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
; 
; initial value must be at least product of all significant digits - false
; must be at least factor of top 2 digits? -> true because n and n-1 cannot share factors
; n*x = (n-1) * x + x
; 
; 1 2 3 -> 6 = (3 * 2) (always discard 1)
; 1 2 3 4 -> 12 = (3 * 4) (discard 2 as if something is divisible by 4 it is also divisible by 2)
; 1 2 3 4 5 -> 60 = (5 * 4 * 3)
; 1 2 3 4 5 6 -> 60 < (6 * 5 * 4) (discard 3 as 3 is factor of 6)
; 
; given a list from 1-n
;   discard all values less than (n / 2) + 1
;   start with n*(n-1)
;    divisible by all remaining values?
;     true return
;     false increment number by lowest remaining value --> this doesnt work because the initial value was necessarily
;     divisible by the lowest significant value. Incrementing by this value is a fail
; 
;; 
; so how about we start with a value we know works (the product of the significant figures) and reduce by
;
;; 6 -> start with 4*5*6 -> 120
;;   -> target is 60 so we must divide by 2
;; 
;; better example:
;;  10 -> starting with (* 6 7 8 9 10) -> 30240
;; loop
;; divide by 2 
;;  is divisible? goto loop
;; divide by 3
;;  is divisible? goto loop
;; .. divide by n
;;  not divisible return value as lowest factor
; (factors 20) -> 232792560
(defn get-significant-numbers
  [n]
  (range (+ 1 
            (quot n 2)) 
         (+ n 1)))

(defn get-initial-number
  [n]
  (reduce * (get-significant-numbers n)))

(defn all-values-factor?
  [value-to-try factors]
  (= 0
     (count (filter #(not= 0 
                           (rem value-to-try %1))
                    factors))))
  
(defn factor-iter
  [last-val-to-try current-val-to-try sig-factors all-factors counter]
  (if (= counter 
         (count sig-factors))
      last-val-to-try   
  (if (all-values-factor? current-val-to-try sig-factors)
      (recur current-val-to-try
             (/ current-val-to-try
                (first all-factors))
             sig-factors
             all-factors
             0)
      (recur last-val-to-try 
             (/ last-val-to-try
                (nth all-factors counter))
             sig-factors
             all-factors
             (+ counter 1))))))

(defn factors
  [n]
  (factor-iter (get-initial-number n)
               (get-initial-number n)
               (get-significant-numbers n)
               (range 2 (+ 1 n))
               0))
               
