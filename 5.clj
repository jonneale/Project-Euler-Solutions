
(defn div-iter
  [counter current-list]
  (if (= (count (filter (fn[x] (not= 0 
                                (rem counter x)))
                         current-list)) 
          0)
      counter
      (div-iter (+ 1 counter) current-list)))
      
(defn divisible
  [max]
  (div-iter  (range 1 (+ max 1))))