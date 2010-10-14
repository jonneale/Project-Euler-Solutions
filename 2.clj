(defn fib-iter 
  [temp]
  (if (> (first temp) 4000000)
  temp
  (fib-iter
    (conj temp (+ (first temp) 
              (second temp))))))

(defn fib
  []
  (fib-iter '(2 1)))
  
(defn sum-even-fibonacci
  []
  (reduce + (map #(if (= 0 
                      (rem %1 2))
                  (+ 0 %1)
                  (+ 0 0))
            (fib))))
    
  


  