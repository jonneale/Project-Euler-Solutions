(defn generate-fractions
  [max]
  (map #(float (/ 1 %1)) (range 1 (+ max 1))))


(defn string-fractions
  [max]
  (map str (generate-fractions max)))
