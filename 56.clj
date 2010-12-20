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

(defn find-big-pows
  [a b current limit maxa maxb]
  (let [result (reduce + (number-to-digit-list (naive-power a b)))]
    (cond (> result current)
      (cond (> (+ a 1) limit)
        (cond (> (+ b 1) limit)
          (list result a b)
        :else
          (recur 1 (+ b 1) result limit a b))
      :else
        (recur (+ a 1) b result limit a b))
    :else
      (cond (> (+ a 1) limit)
        (cond (> (+ b 1) limit)
          (list current maxa maxb)
        :else
          (recur 1 (+ b 1) current limit maxa maxb))
      :else
        (recur (+ a 1) b current limit maxa maxb)))))
      
(defn find-long-comb
  []
  (find-big-pows 1 1 0 100 0 0))
      
;;   "Elapsed time: 456.836 msecs"
;;   (972 99 95)

    