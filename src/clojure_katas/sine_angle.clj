(ns clojure-katas.sine-angle
  (:require [clojure-katas.core :as core]))

(defn cube
  [number]
  (double (* number number number)))


(defn get-sine
  [r]
  (- (double (* 3.0 r)) (double (* 4.0 (cube r))))
  )
(core/defproblem sine
  "The sine of an angle (specified in radians) can be computed
  by making use of the approximation sin x  x if x is sufficiently small,
  and the trigonometric identity:
    sin(r) = 3sin(r/3) -. 4sin^3(r/3)"
  [angle]
  (if (<= (Math/abs angle)  0.1)
    angle
    (get-sine (sine (/ angle 3.0)) )
    )
  )