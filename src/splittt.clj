(ns splittt (:require [clojure.lang.String :as str]))
(def parent-database "
	varon(juan).
	varon(pepe).
	varon(hector).
	varon(roberto).
	varon(alejandro).
	mujer(maria).
	mujer(cecilia).
	padre(juan, pepe).
	padre(juan, pepa).
	padre(hector, maria).
	padre(roberto, alejandro).
	padre(roberto, cecilia).
	hijo(X, Y) :- varon(X), padre(Y, X).
	hija(X, Y) :- mujer(X), padre(Y, X).
")
(def separadas (str/split parent-database #"\."))
(defn -main [parent-database]
; Clojure
(defn hello [name]
 	(let [ 
			separadas (str/split parent-database #"\." )
			inferencias (filter (tiene :-) separada)
			relacion (filter (no tiene :-) separada)
			partes de inferencias (map (split por :-) inferencias)
			...
			...
			base-parseadas (...
		]
		base-parseada
	)
)

