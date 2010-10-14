(defn is_prime_iter [x i]
  (if (> i (/ x 2)) 
  true
  (if (= 0 (rem x i))
  false
  (is_prime_iter x (+ i 1)))))

(defn is_prime? [x]
  (is_prime_iter x 2))
  
(defn biggest-prime-factor-iter [x i biggest_prime]
  (if (> i (/ x 2))
   biggest_prime
   (if (and (= (rem x i) 0) (is_prime? i))
    (biggest-prime-factor-iter x (+ i 1) i)
    (biggest-prime-factor-iter x (+ i 1) biggest_prime))))
    
(defn biggest-prime-factor [x]
  (biggest-prime-factor-iter x 1 1))
  
  
  (filter (fn[x] (= 0 (rem 3 x))) (list 1 2 3 4 5))
  
  (defn find-primes-in-range
    [values, n]
      (if (> (first values) (/ n 2))
      values
      (find-primes-in-range (filter (fn[x] (= 0 
                                              (rem (first (pop values)) 
                                              x))) 
                            (values)) 
                            n)))



(defn get-all-primes 
  [n]
  (find-primes-in-range (range 2 (/ n 2)) n))
  
  
  
  
  (filter (fn[x] (= 0 (rem (first (pop values)) x))) values)

  
  