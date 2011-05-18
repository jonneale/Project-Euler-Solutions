;; Partitions
;;  wire length n
;;  partition wire with a, and b and c = n - (a + b)
;; 
;; a = 1 -> n - 2  b = 1 c = 1
;; b = a -> n - 1 c = 

;;  a^2 + b^2 = c^3


;;  given 12, we know that all multiples of multiples have at least 1

;; generate all c's

;; c < ((2pq)^2 + (p^2-q^2)^2)
;; a = 2pq
;;  b = p^2 - q^2 
;;  perimeter = 2pq + 2p^2
;; perimeter = 2p (q + p)
;; for any perimeter 
;;  any p or q will give a right angled triangle
;; can't have 2 perimeters which are in lowest form


;; that 2 means perimeter has to be even
;;  p has to be a factor of perimeter
;; 

(defn find-factors
  [n]
  (filter #(= 0 
              (rem n %1)) 
          (range 1
                 (+ n 1))))

;;  for each perimeter, (every even value between 2 and 1,500,000)
;;    is it even? - increment by 2
;;  


;; map test
;; filter if they are integers
;;  /2 /p take p away
;;  if none fail
;;  if more than one fail

(defn one-soln?
    [perimeter]
    ( (find-factors perimeter))

(defn iter-right
  (filter (one-soln? ())

(defn find-rights
  [max]
  (iter-right (range 1 (+ max 1) 2)))
  
