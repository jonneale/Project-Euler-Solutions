(defn square
  [x]
  (* x x))
  
(defn pythag
  [a b c]
  (cond (= (+ (square a)
              (square b))
           (square c))
        (list a b c)
        :else
            (cond (not (> (- c 1) b))
              (recur (+ a 1) (+ a 2) (- 1000 a a 3))
            :else
              (recur a (+ b 1) (- c 1)))))
          


(time (reduce * (pythag 3 5 992)))

;; "Elapsed time: 13.029 msecs"
;; (200 375 425)

;; "Elapsed time: 83.906 msecs"
;; 31875000
