(defn find-seq
  ([x current-seq]
    (cond 
      (= x 1)
          (conj current-seq x)
      (even? x)
          (recur (/ x 2) (conj current-seq x))
      :else
          (recur (+ 1 (* 3 x)) (conj current-seq x))))
    ([x]
      (find-seq x ())))

(defn find-longest-seq-under-x
  ([x i longest-seq long-num]
    (let [current-seq (find-seq i)]
      (cond 
        (> i x)
          long-num
        (> (count current-seq) (count longest-seq))
          (recur x (+ i 1) current-seq i)
        :else
          (recur x (+ i 1) longest-seq long-num))))
  ([x]
    (find-longest-seq-under-x x 1 () 1)))
    
    ; (time (find-longest-seq-under-x 1000000))
    ; "Elapsed time: 9456.626 msecs"
    ; 837799

        