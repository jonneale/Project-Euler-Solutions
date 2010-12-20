(defn partition-max
  [max]
  (range (quot (+ max 2) 2) (+ max 1)))
  
(defn div-iter
  [counter current-list]
  (if (= (count (filter (fn[x] (not= 0 
                                (rem counter x)))
                         current-list)) 
          0)
      counter
      (recur (+ 1 counter) current-list)))
      
(defn divisible
  [max counter starting-point]
  (if (> counter max)
      starting-point
      (recur max (+ 1 counter) (div-iter 1 (partition-max max)))))
      
(defn factors
  [max]
  divisible max 2 1)
  
;; lowest common factor of of 1 to 20 is 
