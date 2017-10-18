;; Arithmetic Progression with n-terms
;; a, (a+d), (a+2d), (a+3d),...... (a+(n-1)d)
;;Initial Term -> a, Common Difference -> d, No: of Terms -> n

(defn nth-term [a d n]
  "gives the nth-term in a A.P"
  (+ a (* (- n 1)
          d)))

(defn sum-of-first-n [a d n]
  "gives the sum of first n-terms in a A.P"
  (* (/ n 2)
     (+ (* 2 a)
        (* (- n 1)
           d))))

;;Tests:

(assert (= 5 (nth-term 1 1 5)))          ;;1,2,3,4,5
(assert (= 27 (nth-term 0 3 10)))        ;; 0,3,6,9,12...27

(assert (= 45 (sum-of-first-n 0 1 10)))  ;; 0+1+2+..+9 = 45
(assert (= 0 (sum-of-first-n -3 1 7)))   ;; (-3)+(-2)+(-1)+0+1+2+3 = 0
