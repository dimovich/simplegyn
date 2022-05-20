(ns ^:figwheel-hooks simplegyn.core
  (:require [reagent.dom :as rd]
            [simplegyn.components :as sc]))


(defn app []
  [sc/index])


(defn ^:after-load reload []
  (rd/render [app] (.getElementById js/document "app")))


(defn main []
  (reload))
