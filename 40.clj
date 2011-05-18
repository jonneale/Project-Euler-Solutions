(defn get-digits
  []
  (let [number (reduce str (range 1 1000001))]
        (* (number 0) (number 9) (number 99) (number 999) (number 9999) (number 99999) (number 999999))))
