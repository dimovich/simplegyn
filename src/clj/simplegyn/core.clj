(ns simplegyn.core
  (:require [roll.core :as r])
  
  (:gen-class))


(defn -main []
  (r/init "config.edn"))
