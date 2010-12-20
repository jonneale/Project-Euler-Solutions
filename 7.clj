;; Solution based on SICP ex 1.22

(defn square
      [x]
      (* x x))
(defn divides?
      [a b]
      (= (rem b a) 0))
(defn find-divisor 
      [n test-divisor]
         (cond (> (square test-divisor) n)
               n
               (divides? test-divisor n) test-divisor
               :else
               (find-divisor n (+ test-divisor 1))))

(defn smallest-divisor
      [n]
      (find-divisor n 2))
(defn prime?
      [n]
      (= n (smallest-divisor n)))
(defn start-prime-test
      [n]
      (if (prime? n)
          (str "***")))      
(defn timed-prime-test
      [n]
      (do (println n)
          (time (start-prime-test n))))
(defn next
    [x]
    (cond (= x 2)
          3
          (odd? x)
          (+ x 2)
          :else
          (+ x 1)))
(defn find-primes-iter
  [n x prime-list]
    (cond (= (count prime-list) n)
          prime-list
          (prime? x)
          (recur n (next x) (conj prime-list x))
          :else
          (recur n (next x) prime-list)))
    
(defn find-n-smallest-primes-greater-than-x
      [n x]
      (time (find-primes-iter n x ())))
      
      
(defn find-10001st-prime
  []
  (first (find-n-smallest-primes-greater-than-x 10001 2)))
  
  ; "Elapsed time: 392.299 msecs"
  ; 104743
