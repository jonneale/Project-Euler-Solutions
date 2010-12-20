;; N.B Unfinished -> It's supposed to go to one thousand

(defn sum-one-to-nine
  []
  (reduce + (list (count "one")
                  (count "two")
                  (count "three")
                  (count "four")
                  (count "five")
                  (count "six")
                  (count "seven")
                  (count "eight")
                  (count "nine")
                  )))
(defn sum-teens
  []
  (reduce + (list (count "eleven")
                  (count "twelve")
                  (count "thirteen")
                  (count "fourteen")
                  (count "fifteen")
                  (count "sixteen")
                  (count "seventeen")
                  (count "eighteen")
                  (count "nineteen")
                  )))
(defn sum-tens
  []
  (reduce + (list (count "ten")
                  (count "twenty")
                  (count "thirty")
                  (count "forty")
                  (count "fifty")
                  (count "sixty")
                  (count "seventy")
                  (count "eighty")
                  (count "ninety")
                  )))
(defn sum-one-to-one-hundred
  []
  (+ (sum-teens)
     (sum-tens)
     (* 9 (sum-one-to-nine))))

;;      "Elapsed time: 0.831 msecs"
;;      404