(defun herons-formula (a b c)
  (let ((s (/ (+ a b c) 2)))
    (sqrt (* s (- s a) (- s b) (- s c)))))

(herons-formula 5 12 13) ;;=> 30.0
