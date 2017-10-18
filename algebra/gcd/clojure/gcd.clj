;;euclid-gcd : A function to find the gcd of 2 numbers using the euclidean algorithm
;;  a,b -> gcd (a,b)

(defn euclid-gcd [a b]
  "Returns the gcd of 2 non-negative numbers"
  (if (= b 0)
      a
      (euclid-gcd b (rem a b))))

;;Tests:

(assert (= 2 (euclid-gcd 0 2)))
(assert (= 1 (euclid-gcd 5 7)))
(assert (= 2 (euclid-gcd 4 6)))
(assert (= 10 (euclid-gcd 100 70)))
