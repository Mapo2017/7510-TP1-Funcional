(comment
(ns philosopher-database-test
  (:require [clojure.test :refer :all]
            [logical-interpreter :refer :all]))

; Clojure
;(defn hello [name]
  (println "Hello," 
  ;name
  ))
  ; This is Clojure code.
; When a set is used as a function, it returns the argument if it is
; in the set and nil otherwise.  When used in a boolean context,
; that indicates whether the argument is in the set.
(def vowel? (set "aeiou"))
 
(defn pig-latin [word] ; defines a function
  ; word is expected to be a string
  ; which can be treated like a sequence of characters.
  (let [first-letter (first word)] ; assigns a local binding
    (if (vowel? first-letter)
      (str word "ay") ; then part of if
      (str (subs word 1) first-letter "ay")))) ; else part of if
 
(println (pig-latin "red"))
(println (pig-latin "orange"))
;(deftest parseo-premisas
;  (testing "humano(platon)"))
;    (is (= 
;      (parsear-relacion "humano(platon)")
;      (relacion "humano" (list "platon"))
;    ))
;  )
  