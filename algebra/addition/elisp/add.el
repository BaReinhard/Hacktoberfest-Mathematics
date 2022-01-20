(defun add (f &rest r)
  "returns sum of 1 or more arguments"
  (seq-reduce #'+ (cons f r) 0))

(add 2 3 4 5) ;;14
