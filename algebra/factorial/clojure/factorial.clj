;;Factorial of a number

(defn factorial [n]
  "gives the factorial of a number"
  (if (= n 0)
      (bigint 1)
      (* n (factorial (- n 1)))))

;Tests:

(assert (= 1 (factorial 0)))
(assert (= 120 (factorial 5)))
(assert (= 815915283247897734345611269596115894272000000000
           (factorial 40)))
