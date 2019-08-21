(ns tempo.core
  (:require [clj-time.format :as f]
            [clj-time.core :as t]))

(def t1-string "2019-02-13T10:00:00Z")

(def t2-string "2019-02-13T10:02:00Z")

(f/show-formatters) ; que formatador usaremos para 'parsear' as strings? 

;; Vamos usar o formatador :date-time-no-ms porque nossas strings estao nesse formato.
(def formatador (f/formatters :date-time-no-ms)) 

;; t1 e t2 sao objetos retornados pela funcao f/parse
(def t1 (f/parse formatador t1-string))

(def t2 (f/parse formatador t2-string))

(t/in-minutes (t/interval t1 t2)) ;=> 2


