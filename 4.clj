(defn reverse-string
  [s]
  (apply str (reverse s)))
  
(defn is-palindrome?
  [number]
  (= (str number) (reverse-string (str number))))
  
(defn find-biggest-pallindrome
  [current-list counter]
  (if (= counter (- (count current-list) 1))
      ()
      (if (is-palindrome? (nth current-list (- (count current-list) counter)))
          (list (nth current-list (- (count current-list) counter)))
          (find-biggest-pallindrome current-list (+ 1 counter)))))
  
(defn find-all-iter
  [high counter current-list maxn]
  (if (> (* maxn 0.9) high)
    current-list
  (if (> (* maxn 0.9) counter)
      (find-all-iter (- high 1) maxn (find-biggest-pallindrome (sort current-list) 1) maxn)
      (find-all-iter high
                         (- counter 1)
                         (conj current-list (* counter high))
                         maxn))))
                           
(defn find-all-products
 [maxn]
 (find-all-iter maxn maxn () maxn))