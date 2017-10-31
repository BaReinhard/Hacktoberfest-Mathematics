;; Geometric Progression with n-terms
;; a, ar, ar^2, ar^3,...... ar^(n-1)
;;Initial Term -> a, Common Ratio -> r, No: of Terms -> n

(defn nth-term [a r n]
  "gives the nth-term in a G.P"
  (* a (Math/pow r (- n 1))))

(defn sum-of-first-n [a r n]
  "gives the sum of first n-terms in a G.P"
  (* a (/ (dec (Math/pow r n))
          (dec r))))

;;Tests:

(assert (= 1.0 (nth-term 1 1 5)))          ;;1,1,1,1,1
(assert (= 512.0 (nth-term 1 2 10)))       ;; 0,2,4,8,16...512

(assert (= 0.0 (sum-of-first-n 1 -1 10)))  ;; 1-1+1-1+...-1 = 0
(assert (= 31.0 (sum-of-first-n  1 2 5)))   ;; 1+2+4+8+16 = 31
