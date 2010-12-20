(defn number-to-digit-list
  [n]
  (map #(- (int %1) (int \0)) (str n)))

(reduce + (number-to-digit-list (reduce * (range 1 101))))