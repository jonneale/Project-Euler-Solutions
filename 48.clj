;; N.B. in built exp function converts result to BigDecimal, thus resulting in scientific notation
(defn number-to-digit-list
  [n]
  (map #(- (int %1) (int \0)) (str n)))

(defn naive-pow
  [current max x total]
  (if (= current max)
    total    
    (naive-pow (+ 1 current) max x  (* (bigint total) (bigint x)))))

(defn sum-sequence
  [max]
  (bigint (reduce + (map #(naive-pow 0 % % 1) (range 1 (+ max 1)))
)))


