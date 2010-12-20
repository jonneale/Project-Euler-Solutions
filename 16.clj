;; N.B. in built exp function converts result to BigDecimal, thus resulting in scientific notation
(defn number-to-digit-list
  [n]
  (map #(- (int %1) (int \0)) (str n)))
(defn naive-power
  [i power]
  (raise-a-to-b i power 1 1))
(defn raise-a-to-b
  [a b i prod]
  (cond (> i b)
          prod
        :else
        (recur a b (+ 1 i) (* prod a))))
(defn sum-digits-of-a-to-b
  [a b]
  (reduce + (number-to-digit-list (naive-power a b))))
  
;;   "Elapsed time: 4.668 msecs"
;;   1366