(defun gcd (a b)
  (cond ((or (< a 0) (< b 0)) (gcd (abs a) (abs b)))
	((< a b) (gcd b a))
	((= b 0) a)
	(:else (gcd b (% a b)))))

(gcd 0 -3) ;;=> 3
(gcd 16 12) ;;=> 4

