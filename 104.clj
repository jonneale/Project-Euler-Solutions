(defn next-fib
  [[pos now last]]
  [(inc pos) (+ last now) now])

(defn string-first-nine
  [number]
  (take 9 (str number)))

(defn get-first-nine
 [number]
 (let [number-count (Math/floor (Math/log10 number))
      divisor-pow (- number-count 8)
      divisor (Math/pow 10 divisor-pow)]      
      (if (> 0 divisor-pow)
        false
        (unchecked-divide (BigInt number) (BigInt divisor)))))

(defn pandigital?
   [number]
   (let [freqs (frequencies (str number))]
        (and (= 9 (count freqs))
          (nil? (freqs \0)))))
          
(defn first-nine?
   [number]
   (pandigital? (string-first-nine number)))
 
(defn last-nine?
  [number]
  (pandigital? (rem number 1000000000)))

(def fibs (iterate next-fib [2 1 1]))

(def result
  (for [[pos now last] fibs
        :when   (and 
                 (first-nine? now)
                 true)
        
        ]
    [pos]))
