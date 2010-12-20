(defn square
  [x] (* x x))  
(defn get-permutations
  [number]
  (list (square number) 
        (- (square number) (- number 1))
        (- (square number) (* 2 (- number 1)))
        (- (square number) (* 3 (- number 1))))))
  
(defn get-numbers
  [i number-list current-sum]
  (cond (= i (count number-list))
          current-sum
        :else
        (recur (+ i 1) number-list (+ current-sum (reduce + (get-permutations (nth number-list i)))))))
  
(defn sum-diagonals
  [max]
  (get-numbers 0 (range 3 (+ 1 max) 2) 1))
  
;;   "Elapsed time: 0.114 msecs"
;;   101