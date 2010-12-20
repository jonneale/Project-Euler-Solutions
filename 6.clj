(defn square
  [x]
  (* x x))

(defn ss
  [x]
  (- (reduce + (map #(square %1) (range 1 (inc x)))) (square (reduce + (range 1 (inc x))))))
  
(defn sums
  [x]
  
  
